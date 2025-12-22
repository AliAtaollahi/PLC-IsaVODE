package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.Stmt.AssignmentStatement;
import main.ast.nodes.Stmt.IfThenElseStatement;
import main.ast.nodes.Stmt.Stmt;
import main.ast.nodes.declaration.ProgramBlockBody;
import main.ast.nodes.declaration.StatementList;
import main.ast.nodes.declaration.TypeRule;
import main.ast.nodes.declaration.VarBlock;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expr.BinaryExpr;
import main.ast.nodes.expr.Expr;
import main.ast.nodes.expr.UnaryExpr;
import main.ast.nodes.expr.Variable;
import main.ast.nodes.expr.value.BoolValue;
import main.ast.nodes.expr.value.NumValue;
import org.antlr.v4.runtime.misc.Pair;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CodeGenerator extends Visitor<String> {

    private final String outputPath;
    private FileWriter mainFile;

    // declared variables: name -> isabelle type ("real","bool",...)
    private final LinkedHashMap<String, String> declaredVarTypes = new LinkedHashMap<>();
    // constants discovered in expressions (undeclared identifiers)
    private final LinkedHashSet<String> discoveredConstants = new LinkedHashSet<>();

    private String programName = "prog0";

    private static final List<String> CONSTANT_PRIORITY =
            Arrays.asList("H1", "L1", "L2", "H2", "LL", "FL", "\\<epsilon>");

    public CodeGenerator() {
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }

    private void prepareOutputFolder() {
        File dir = new File(outputPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    private void openMainFile(String fileName) {
        try {
            mainFile = new FileWriter(outputPath + fileName);
        } catch (IOException e) {
            throw new RuntimeException("Cannot open output file: " + outputPath + fileName, e);
        }
    }

    private void closeMainFile() {
        if (mainFile == null) return;
        try {
            mainFile.flush();
            mainFile.close();
        } catch (IOException e) {
            throw new RuntimeException("Cannot close output file.", e);
        } finally {
            mainFile = null;
        }
    }

    private void addLine(String line) {
        try {
            if (mainFile == null) throw new IllegalStateException("Output file is not opened.");
            mainFile.write(line);
            mainFile.write("\n");
        } catch (IOException e) {
            throw new RuntimeException("Error writing output.", e);
        }
    }

    private void addLines(String multiLine) {
        String[] lines = multiLine.split("\n", -1);
        for (String l : lines) addLine(l);
    }

    @Override
    public String visit(Program program) {
        declaredVarTypes.clear();
        discoveredConstants.clear();

        programName = (program.getName() != null) ? program.getName() : "prog0";

        for (VarBlock vb : program.getVarBlocks()) {
            vb.accept(this);
        }

        ProgramBlockBody body = program.getProgramBlockBody();
        List<Stmt> stmts = (body != null && body.getStatementList() != null)
                ? body.getStatementList().getStatements()
                : Collections.emptyList();

        String ctrl = renderCtrl(stmts);

        discoveredConstants.add("\\<epsilon>");

        String theoryName = "WTT_Safe";
        openMainFile(theoryName + ".thy");

        addLine("theory " + theoryName);
        addLine("  imports \"Hybrid-Verification.Hybrid_Verification\"");
        addLine("begin");
        addLine("");
        addLine("dataspace " + programName + " =");
        addLine("  constants");

        for (String c : orderConstantsForGolden(discoveredConstants)) {
            addLine("    " + c + " :: real");
        }

        addLine("  assumes");
        addLine("    eps_is_1: \"ε = 1\"");
        addLine("  variables");

        int maxNameLen = 0;
        for (String n : declaredVarTypes.keySet()) maxNameLen = Math.max(maxNameLen, n.length());

        for (Map.Entry<String, String> e : declaredVarTypes.entrySet()) {
            String name = e.getKey();
            String ty = e.getValue();
            String padded = padRight(name, maxNameLen);
            addLine("    " + padded + " :: " + ty);
        }

        addLine("");
        addLine("context " + programName);
        addLine("begin");
        addLine("");
        addLine("definition \"ctrl ≡");
        addLines(ctrl);
        addLine("\"");
        addLine("");
        addLine("end");
        addLine("");
        addLine("end");

        closeMainFile();
        return null;
    }

    private static String padRight(String s, int width) {
        if (s.length() >= width) return s;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < width) sb.append(' ');
        return sb.toString();
    }

    private List<String> orderConstantsForGolden(Set<String> constants) {
        List<String> out = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        for (String p : CONSTANT_PRIORITY) {
            if (constants.contains(p)) {
                out.add(p);
                seen.add(p);
            }
        }
        for (String c : constants) {
            if (!seen.contains(c)) out.add(c);
        }
        return out;
    }

    @Override
    public String visit(VarBlock varBlock) {
        for (VariableDeclaration vd : varBlock.getVariableDeclarations()) {
            vd.accept(this);
        }
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        TypeRule tr = variableDeclaration.getTypeRule();
        String plcType = (tr != null) ? tr.getName() : null;
        String isaType = mapType(plcType);

        for (String name : variableDeclaration.getNames()) {
            declaredVarTypes.putIfAbsent(name, isaType);
        }
        return null;
    }

    @Override
    public String visit(TypeRule typeRule) {
        return null;
    }

    private String mapType(String plcType) {
        if (plcType == null) return "real";
        String t = plcType.trim().toUpperCase(Locale.ROOT);
        return switch (t) {
            case "REAL", "LREAL" -> "real";
            case "BOOL" -> "bool";
            case "INT", "DINT", "SINT", "USINT", "UINT", "UDINT", "LINT", "ULINT" -> "int";
            default -> plcType.toLowerCase(Locale.ROOT);
        };
    }

    private boolean isBoolVar(String name) {
        return "bool".equals(declaredVarTypes.get(name));
    }

    private String renderCtrl(List<Stmt> topLevel) {
        if (topLevel == null || topLevel.isEmpty()) {
            return "  skip\n";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("  ").append(renderStmt(topLevel.get(0), StmtCtx.TOP_LEVEL_FIRST));

        for (int i = 1; i < topLevel.size(); i++) {
            sb.append("\n; ").append(renderStmt(topLevel.get(i), StmtCtx.TOP_LEVEL_NEXT));
        }

        sb.append("\n");
        return sb.toString();
    }

    private enum StmtCtx {
        TOP_LEVEL_FIRST,
        TOP_LEVEL_NEXT,
        IN_BLOCK_INLINE
    }

    private String renderStmt(Stmt stmt, StmtCtx ctx) {
        if (stmt instanceof AssignmentStatement asg) {
            String var = (asg.getVariable() != null) ? asg.getVariable().getName() : "<?>";

            String expected = isBoolVar(var) ? "bool" : declaredVarTypes.get(var);
            String rhs = renderExpr(asg.getExpr(), PREC_LOWEST, expected);

            return var + " := " + rhs;
        }

        if (stmt instanceof IfThenElseStatement ite) {
            boolean inline = (ctx == StmtCtx.IN_BLOCK_INLINE);
            return renderIfThenElse(ite, inline);
        }

        return "skip";
    }

    private String renderIfThenElse(IfThenElseStatement ite, boolean preferInline) {
        List<Pair<Expr, StatementList>> parts = ite.getIfThenElseList();
        if (parts == null || parts.isEmpty()) return "(IF True THEN skip)";

        String elseProg = null;
        if (ite.getElseStatementList() != null) {
            elseProg = renderStmtListAsProgram(ite.getElseStatementList(), true);
        }

        for (int i = parts.size() - 1; i >= 0; i--) {
            Expr cond = parts.get(i).a;
            StatementList thenList = parts.get(i).b;

            boolean hasElseHere = (elseProg != null);

            if (!hasElseHere && preferInline && parts.size() == 1) {
                String c = renderIfCondition(cond);
                String thenProg = renderStmtListAsProgram(thenList, true);
                elseProg = "(IF " + c + " THEN " + thenProg + ")";
                continue;
            }

            String c = renderIfCondition(cond);
            String thenProg = renderStmtListAsProgram(thenList, false);

            if (hasElseHere) {
                StringBuilder sb = new StringBuilder();
                sb.append("(IF ").append(c).append(" THEN\n");
                sb.append("      ").append(thenProg).append("\n");
                sb.append("   ELSE\n");
                sb.append("      ").append(elseProg).append(")");
                elseProg = sb.toString();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("(IF ").append(c).append(" THEN\n");
                sb.append("      ").append(thenProg).append("\n");
                sb.append("  )");
                elseProg = sb.toString();
            }
        }

        return elseProg;
    }

    private String renderStmtListAsProgram(StatementList list, boolean inlineIfPossible) {
        if (list == null || list.getStatements() == null || list.getStatements().isEmpty()) {
            return "skip";
        }
        List<Stmt> stmts = list.getStatements();

        if (stmts.size() == 1) {
            Stmt only = stmts.get(0);

            if (inlineIfPossible && only instanceof IfThenElseStatement) {
                return renderStmt(only, StmtCtx.IN_BLOCK_INLINE);
            }

            return renderStmt(only, StmtCtx.IN_BLOCK_INLINE);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < stmts.size(); i++) {
            if (i > 0) sb.append("; ");
            sb.append(renderStmt(stmts.get(i), StmtCtx.IN_BLOCK_INLINE));
        }
        sb.append(")");
        return sb.toString();
    }

    private String renderIfCondition(Expr cond) {
        String c = renderExpr(cond, PREC_LOWEST, "bool");

        if (cond instanceof BinaryExpr be) {
            String op = be.getOperator();
            if (op != null && op.equalsIgnoreCase("OR")) {
                return "(" + c + ")";
            }
        }
        return c;
    }

    private static final int PREC_LOWEST = 1;
    private static final int PREC_OR = 2;
    private static final int PREC_XOR = 3;
    private static final int PREC_AND = 4;
    private static final int PREC_EQ = 5;
    private static final int PREC_REL = 6;
    private static final int PREC_ADD = 7;
    private static final int PREC_MUL = 8;
    private static final int PREC_POW = 9;
    private static final int PREC_UNARY = 10;

    private String renderExpr(Expr e, int parentPrec, String expectedType) {
        if (e == null) return "0";

        if (e instanceof Variable v) {
            String name = v.getName();
            if (name == null) return "<?>";

            // If not declared as a program variable => treat as constant
            if (!declaredVarTypes.containsKey(name)) {
                discoveredConstants.add(name);
            }
            return name;
        }

        if (e instanceof BoolValue bv) {
            String val = bv.getValue();
            if (val == null) return "False";
            if (val.equalsIgnoreCase("TRUE")) return "True";
            if (val.equalsIgnoreCase("FALSE")) return "False";
            return val;
        }

        if (e instanceof NumValue nv) {
            String raw = nv.getValue() != null ? nv.getValue() : "0";
            boolean neg = nv.isMinus();

            // PLC BOOL often written as 0/1; map to False/True when assigning to bool
            if ("bool".equals(expectedType) && !neg) {
                if ("0".equals(raw) || "0.0".equals(raw)) return "False";
                if ("1".equals(raw) || "1.0".equals(raw)) return "True";
            }

            return (neg ? "-" : "") + raw;
        }

        if (e instanceof UnaryExpr ue) {
            String op = ue.getOperator();
            int myPrec = PREC_UNARY;

            String opStr = mapUnaryOp(op);
            String inner = renderExpr(ue.getOperand(), myPrec, expectedType);

            String out = isNotOp(op) ? (opStr + " " + inner) : (opStr + inner);
            return parenthesizeIfNeeded(out, myPrec, parentPrec);
        }

        if (e instanceof BinaryExpr be) {
            String op = be.getOperator();
            int myPrec = precOf(op);

            String mapped = mapBinaryOp(op);
            String left = renderExpr(be.getFirstOperand(), myPrec, null);
            String right = renderExpr(be.getSecondOperand(), myPrec, null);

            String out = left + " " + mapped + " " + right;
            return parenthesizeIfNeeded(out, myPrec, parentPrec);
        }

        return "0";
    }

    private String parenthesizeIfNeeded(String s, int myPrec, int parentPrec) {
        if (myPrec < parentPrec) return "(" + s + ")";
        return s;
    }

    private boolean isNotOp(String op) {
        return op != null && op.equalsIgnoreCase("NOT");
    }

    private int precOf(String op) {
        if (op == null) return PREC_LOWEST;
        return switch (op.toUpperCase(Locale.ROOT)) {
            case "OR" -> PREC_OR;
            case "XOR" -> PREC_XOR;
            case "AND", "&" -> PREC_AND;
            case "=", "<>" -> PREC_EQ;
            case "<", ">", "<=", ">=" -> PREC_REL;
            case "+", "-" -> PREC_ADD;
            case "*", "/" -> PREC_MUL;
            case "**" -> PREC_POW;
            default -> PREC_LOWEST;
        };
    }

    private String mapUnaryOp(String op) {
        if (op == null) return "";
        return switch (op.toUpperCase(Locale.ROOT)) {
            case "NOT" -> "¬";
            case "-" -> "-";
            default -> op;
        };
    }

    private String mapBinaryOp(String op) {
        if (op == null) return op;

        return switch (op.toUpperCase(Locale.ROOT)) {
            case "OR" -> "∨";
            case "AND", "&" -> "∧";
            case "XOR" -> "XOR";
            case "<=" -> "≤";
            case ">=" -> "≥";
            case "<>" -> "≠";
            default -> op;
        };
    }

    @Override
    public String visit(Stmt stmt) { return null; }

    @Override
    public String visit(AssignmentStatement assignmentStatement) { return null; }

    @Override
    public String visit(IfThenElseStatement ifThenElseStatement) { return null; }

    @Override
    public String visit(BinaryExpr binaryExpr) { return null; }

    @Override
    public String visit(UnaryExpr unaryExpr) { return null; }

    @Override
    public String visit(Variable variable) { return null; }
}
