package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.Stmt.AssignmentStatement;
import main.ast.nodes.Stmt.IfThenElseStatement;
import main.ast.nodes.Stmt.Stmt;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class CodeGenerator extends Visitor<String> {

    private final String outputPath;
    private FileWriter mainFile;

    private final LinkedHashMap<String, String> declaredVarTypes = new LinkedHashMap<>();
    private final LinkedHashSet<String> discoveredConstants = new LinkedHashSet<>();

    private String programName = "prog0";

    private static final String ASSIGN_OP = ":=";
    private static final String GROUPED_SEQ_SEP = ";\n ";

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

    private String sanitizeTheoryOrFileName(String name) {
        if (name == null || name.isBlank()) return "prog0_Orig";
        return name.replaceAll("[^A-Za-z0-9_]", "_");
    }

    @Override
    public String visit(SourceUnit sourceUnit) {
        if (sourceUnit == null || sourceUnit.getProgram() == null) {
            return null;
        }
        sourceUnit.getProgram().accept(this);
        return null;
    }

    @Override
    public String visit(Program program) {
        declaredVarTypes.clear();
        discoveredConstants.clear();

        programName = (program.getName() != null && !program.getName().isBlank())
                ? program.getName()
                : "prog0";

        for (VarBlock vb : program.getVarBlocks()) {
            vb.accept(this);
        }

        ProgramBlockBody body = program.getProgramBlockBody();
        List<Stmt> stmts = (body != null && body.getStatementList() != null)
                ? body.getStatementList().getStatements()
                : Collections.emptyList();

        String ctrl = renderCtrl(stmts);

        discoveredConstants.add("\\<epsilon>");

        String theoryName = sanitizeTheoryOrFileName(programName + "_Orig");
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
        for (String n : declaredVarTypes.keySet()) {
            maxNameLen = Math.max(maxNameLen, n.length());
        }

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
        boolean first = true;

        for (int i = 0; i < topLevel.size(); i++) {
            Stmt stmt = topLevel.get(i);
            String p = renderStmt(stmt, StmtCtx.TOP_LEVEL);
            if (isEmptyProgram(p)) continue;

            if (!first) {
                sb.append(";\n");
                Stmt prev = topLevel.get(i - 1);
                if (isForStatement(prev) || isWhileStatement(prev)) {
                    sb.append("\n");
                }
            }

            sb.append(indent(p, "  "));
            first = false;
        }

        sb.append("\n");
        return sb.toString();
    }

    private enum StmtCtx {
        TOP_LEVEL,
        IN_BLOCK_INLINE
    }

    private enum LoopKind {
        FOR,
        WHILE
    }

    private static final class LoopControl {
        final LoopKind kind;
        final String varName;
        final Expr boundExpr;
        final Expr stepExpr;
        final String cmpOp;
        final Expr whileConditionExpr;

        LoopControl(LoopKind kind, String varName, Expr boundExpr, Expr stepExpr, String cmpOp, Expr whileConditionExpr) {
            this.kind = kind;
            this.varName = varName;
            this.boundExpr = boundExpr;
            this.stepExpr = stepExpr;
            this.cmpOp = cmpOp;
            this.whileConditionExpr = whileConditionExpr;
        }
    }

    private String renderStmt(Stmt stmt, StmtCtx ctx) {
        if (stmt instanceof AssignmentStatement asg) {
            String var = (asg.getVariable() != null) ? asg.getVariable().getName() : "<?>";
            String expected = isBoolVar(var) ? "bool" : declaredVarTypes.get(var);
            String rhs = renderExpr(asg.getExpr(), PREC_LOWEST, expected);
            return var + " " + ASSIGN_OP + " " + rhs;
        }

        if (stmt instanceof IfThenElseStatement ite) {
            boolean inline = (ctx == StmtCtx.IN_BLOCK_INLINE);
            return renderIfThenElse(ite, inline);
        }

        if (isForStatement(stmt)) {
            return renderForStatement(stmt);
        }

        if (isWhileStatement(stmt)) {
            return renderWhileStatement(stmt);
        }

        if (isExitStatement(stmt) || isContinueStatement(stmt)) {
            return "skip";
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
                sb.append(indent(parenthesizeIfNeededForProgram(thenProg), "    ")).append("\n");
                sb.append(" ELSE\n");
                sb.append(indent(parenthesizeIfNeededForProgram(elseProg), "    ")).append(")");
                elseProg = sb.toString();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("(IF ").append(c).append(" THEN\n");
                sb.append(indent(parenthesizeIfNeededForProgram(thenProg), "    ")).append("\n");
                sb.append(")");
                elseProg = sb.toString();
            }
        }

        return elseProg;
    }

    private String renderStmtListAsProgram(StatementList list, boolean inlineIfPossible) {
        if (list == null || list.getStatements() == null || list.getStatements().isEmpty()) {
            return "skip";
        }

        List<String> parts = new ArrayList<>();
        for (Stmt stmt : list.getStatements()) {
            String p = renderStmt(stmt, StmtCtx.IN_BLOCK_INLINE);
            if (!isEmptyProgram(p)) {
                parts.add(p);
            }
        }

        if (parts.isEmpty()) return "skip";
        if (parts.size() == 1) return parts.get(0);

        return "(" + joinPrograms(parts, GROUPED_SEQ_SEP) + ")";
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

    private String renderForStatement(Stmt stmt) {
        String varName = extractLoopVariableName(stmt);
        Expr fromExpr = extractExpr(stmt,
                "getFromExpr", "getStartExpr", "getInitExpr", "getInitialExpr", "getInit", "getStart");
        Expr toExpr = extractExpr(stmt,
                "getToExpr", "getEndExpr", "getFinalExpr", "getStopExpr", "getEnd", "getTo");
        Expr byExpr = extractExpr(stmt,
                "getByExpr", "getStepExpr", "getIncrementExpr", "getStep", "getBy");
        StatementList body = extractStatementList(stmt,
                "getStatementList", "getBody", "getLoopBody", "getBlock", "getProgramBlockBody");

        if (varName == null) varName = "i";
        if (byExpr == null) byExpr = makeNumValue("1", false);

        boolean negativeStep = isNegativeExpr(byExpr);
        String cmp = negativeStep ? ">=" : "<=";

        LoopControl lc = new LoopControl(LoopKind.FOR, varName, toExpr, byExpr, cmp, null);

        String init = varName + " " + ASSIGN_OP + " " + renderExpr(fromExpr, PREC_LOWEST, "int");
        String cond = renderLoopCondition(lc);
        String bodyProg = renderLoopStmtList(body != null ? body.getStatements() : Collections.emptyList(), lc);
        String loop = "(WHILE " + cond + " DO\n" + indent(parenthesizeIfNeededForProgram(bodyProg), "  ") + ")";

        return joinPrograms(Arrays.asList(init, loop), ";\n");
    }

    private String renderWhileStatement(Stmt stmt) {
        Expr condExpr = extractWhileConditionExpr(stmt);
        StatementList body = extractStatementList(stmt,
                "getStatementList", "getBody", "getLoopBody", "getBlock", "getProgramBlockBody");

        String inferredVar = null;
        Expr inferredBound = null;
        String inferredCmp = null;

        if (condExpr instanceof BinaryExpr be) {
            String op = be.getOperator();
            Expr left = be.getFirstOperand();
            Expr right = be.getSecondOperand();

            if (left instanceof Variable lv && isRelationalOperator(op)) {
                inferredVar = lv.getName();
                inferredBound = right;
                inferredCmp = op;
            } else if (right instanceof Variable rv && isRelationalOperator(op)) {
                inferredVar = rv.getName();
                inferredBound = left;
                inferredCmp = flipRelationalOp(op);
            }
        }

        LoopControl lc = new LoopControl(LoopKind.WHILE, inferredVar, inferredBound, null, inferredCmp, condExpr);

        String cond = renderLoopCondition(lc);
        String bodyProg = renderLoopStmtList(body != null ? body.getStatements() : Collections.emptyList(), lc);
        String loop = "(WHILE " + cond + " DO\n" + indent(parenthesizeIfNeededForProgram(bodyProg), "  ") + ")";

        return loop;
    }

    private String renderLoopStmtList(List<Stmt> stmts, LoopControl lc) {
        String suffix = defaultLoopSuffix(lc);
        return renderLoopStmtList(stmts, 0, lc, suffix);
    }

    private String renderLoopStmtList(List<Stmt> stmts, int index, LoopControl lc, String suffix) {
        if (stmts == null || index >= stmts.size()) {
            return suffix == null ? "" : suffix;
        }

        Stmt stmt = stmts.get(index);

        if (isExitStatement(stmt)) {
            return renderLoopExit(lc);
        }

        if (isContinueStatement(stmt)) {
            return renderLoopContinue(lc);
        }

        String rest = renderLoopStmtList(stmts, index + 1, lc, suffix);

        if (stmt instanceof IfThenElseStatement ite) {
            return renderLoopAwareIfThenElse(ite, lc, rest);
        }

        String curr = renderStmt(stmt, StmtCtx.IN_BLOCK_INLINE);
        return joinPrograms(Arrays.asList(curr, rest), GROUPED_SEQ_SEP);
    }

    private String renderLoopAwareIfThenElse(IfThenElseStatement ite, LoopControl lc, String rest) {
        List<Pair<Expr, StatementList>> parts = ite.getIfThenElseList();
        if (parts == null || parts.isEmpty()) return "skip";

        String elseProg = null;

        if (ite.getElseStatementList() != null) {
            elseProg = renderLoopStmtList(
                    ite.getElseStatementList().getStatements(),
                    0,
                    lc,
                    rest
            );
        } else if (!isEmptyProgram(rest) && !"skip".equals(rest)) {
            elseProg = rest;
        }

        for (int i = parts.size() - 1; i >= 0; i--) {
            Expr cond = parts.get(i).a;
            StatementList thenList = parts.get(i).b;

            String c = renderIfCondition(cond);
            String thenProg = renderLoopStmtList(
                    thenList != null ? thenList.getStatements() : Collections.emptyList(),
                    0,
                    lc,
                    rest
            );

            if (elseProg != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("(IF ").append(c).append(" THEN\n");
                sb.append(indent(parenthesizeIfNeededForProgram(thenProg), "    ")).append("\n");
                sb.append(" ELSE\n");
                sb.append(indent(parenthesizeIfNeededForProgram(elseProg), "    ")).append(")");
                elseProg = sb.toString();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("(IF ").append(c).append(" THEN\n");
                sb.append(indent(parenthesizeIfNeededForProgram(thenProg), "    ")).append("\n");
                sb.append(")");
                elseProg = sb.toString();
            }
        }

        return elseProg;
    }

    private String defaultLoopSuffix(LoopControl lc) {
        if (lc == null) return "";
        if (lc.kind == LoopKind.FOR) return renderForStep(lc);
        return "";
    }

    private String renderLoopContinue(LoopControl lc) {
        if (lc == null) return "";
        if (lc.kind == LoopKind.FOR) return renderForStep(lc);
        return "";
    }

    private String renderLoopExit(LoopControl lc) {
        if (lc == null) return "";

        if (lc.kind == LoopKind.FOR) {
            Integer boundVal = tryEvalIntExpr(lc.boundExpr);
            Integer stepVal = tryEvalSignedIntExpr(lc.stepExpr);

            if (boundVal != null && stepVal != null) {
                return lc.varName + " " + ASSIGN_OP + " " + (boundVal + stepVal);
            }

            String end = renderExpr(lc.boundExpr, PREC_ADD, "int");
            String stepMag = renderPositiveMagnitude(lc.stepExpr);

            if (isNegativeExpr(lc.stepExpr)) {
                return lc.varName + " " + ASSIGN_OP + " " + end + " - " + stepMag;
            } else {
                return lc.varName + " " + ASSIGN_OP + " " + end + " + " + stepMag;
            }
        }

        if (lc.kind == LoopKind.WHILE && lc.varName != null && lc.boundExpr != null && lc.cmpOp != null) {
            Integer boundVal = tryEvalIntExpr(lc.boundExpr);
            if (boundVal != null) {
                return switch (lc.cmpOp) {
                    case "<=" -> lc.varName + " " + ASSIGN_OP + " " + (boundVal + 1);
                    case "<"  -> lc.varName + " " + ASSIGN_OP + " " + boundVal;
                    case ">=" -> lc.varName + " " + ASSIGN_OP + " " + (boundVal - 1);
                    case ">"  -> lc.varName + " " + ASSIGN_OP + " " + boundVal;
                    default   -> "";
                };
            }

            String bound = renderExpr(lc.boundExpr, PREC_ADD, inferExprType(lc.boundExpr));
            return switch (lc.cmpOp) {
                case "<=" -> lc.varName + " " + ASSIGN_OP + " " + bound + " + 1";
                case "<"  -> lc.varName + " " + ASSIGN_OP + " " + bound;
                case ">=" -> lc.varName + " " + ASSIGN_OP + " " + bound + " - 1";
                case ">"  -> lc.varName + " " + ASSIGN_OP + " " + bound;
                default   -> "";
            };
        }

        return "";
    }

    private String renderForStep(LoopControl lc) {
        if (lc == null || lc.varName == null) return "";

        Integer stepVal = tryEvalSignedIntExpr(lc.stepExpr);
        if (stepVal != null) {
            if (stepVal < 0) {
                return lc.varName + " " + ASSIGN_OP + " " + lc.varName + " - " + Math.abs(stepVal);
            }
            return lc.varName + " " + ASSIGN_OP + " " + lc.varName + " + " + stepVal;
        }

        if (lc.stepExpr == null) {
            return lc.varName + " " + ASSIGN_OP + " " + lc.varName + " + 1";
        }

        String mag = renderPositiveMagnitude(lc.stepExpr);
        if (isNegativeExpr(lc.stepExpr)) {
            return lc.varName + " " + ASSIGN_OP + " " + lc.varName + " - " + mag;
        }
        return lc.varName + " " + ASSIGN_OP + " " + lc.varName + " + " + mag;
    }

    private String renderLoopCondition(LoopControl lc) {
        if (lc == null) return "True";

        if (lc.kind == LoopKind.FOR) {
            String op = mapBinaryOp(lc.cmpOp);
            return lc.varName + " " + op + " " + renderExpr(lc.boundExpr, PREC_REL, "int");
        }

        return renderExpr(lc.whileConditionExpr, PREC_LOWEST, "bool");
    }

    private boolean isForStatement(Stmt stmt) {
        return hasSimpleName(stmt, "ForStatement");
    }

    private boolean isWhileStatement(Stmt stmt) {
        return hasSimpleName(stmt, "WhileStatement");
    }

    private boolean isExitStatement(Stmt stmt) {
        return hasSimpleName(stmt, "ExitStatement");
    }

    private boolean isContinueStatement(Stmt stmt) {
        return hasSimpleName(stmt, "ContinueStatement");
    }

    private boolean hasSimpleName(Object obj, String simpleName) {
        return obj != null && obj.getClass().getSimpleName().equals(simpleName);
    }

    private Object invokeGetter(Object target, String... getterNames) {
        if (target == null) return null;
        for (String getterName : getterNames) {
            try {
                Method m = target.getClass().getMethod(getterName);
                return m.invoke(target);
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    private Object invokeAnyGetterByValueType(Object target, Class<?> wanted) {
        if (target == null) return null;
        for (Method m : target.getClass().getMethods()) {
            if (m.getParameterCount() != 0) continue;
            if (m.getName().equals("getClass")) continue;
            try {
                Object value = m.invoke(target);
                if (value != null && wanted.isAssignableFrom(value.getClass())) {
                    return value;
                }
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    private Object readField(Object target, String... fieldNames) {
        if (target == null) return null;
        Class<?> c = target.getClass();
        while (c != null) {
            for (String fieldName : fieldNames) {
                try {
                    Field f = c.getDeclaredField(fieldName);
                    f.setAccessible(true);
                    return f.get(target);
                } catch (Exception ignored) {
                }
            }
            c = c.getSuperclass();
        }
        return null;
    }

    private Object readAnyFieldByValueType(Object target, Class<?> wanted) {
        if (target == null) return null;
        Class<?> c = target.getClass();
        while (c != null) {
            for (Field f : c.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    Object value = f.get(target);
                    if (value != null && wanted.isAssignableFrom(value.getClass())) {
                        return value;
                    }
                } catch (Exception ignored) {
                }
            }
            c = c.getSuperclass();
        }
        return null;
    }

    private Expr extractExpr(Object target, String... getterNames) {
        Object obj = invokeGetter(target, getterNames);
        if (obj instanceof Expr e) return e;

        obj = readField(target,
                "condition", "expr", "expression", "booleanExpr", "guard", "cond",
                "conditionExpr", "whileConditionExpr", "loopCondition");
        if (obj instanceof Expr e) return e;

        obj = invokeAnyGetterByValueType(target, Expr.class);
        if (obj instanceof Expr e) return e;

        obj = readAnyFieldByValueType(target, Expr.class);
        if (obj instanceof Expr e) return e;

        return null;
    }

    private Expr extractWhileConditionExpr(Object target) {
        Object obj = invokeGetter(target,
                "getCondition", "getBooleanExpr", "getGuard", "getCond",
                "getConditionExpr", "getWhileConditionExpr", "getLoopCondition",
                "getExpr", "getExpression");
        if (obj instanceof Expr e) return e;

        obj = readField(target,
                "condition", "booleanExpr", "guard", "cond",
                "conditionExpr", "whileConditionExpr", "loopCondition",
                "expr", "expression");
        if (obj instanceof Expr e) return e;

        Class<?> c = target.getClass();
        while (c != null) {
            for (Field f : c.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    Object value = f.get(target);
                    if (value instanceof Expr e) {
                        if (e instanceof BinaryExpr || e instanceof UnaryExpr || e instanceof Variable || e instanceof BoolValue) {
                            return e;
                        }
                    }
                } catch (Exception ignored) {
                }
            }
            c = c.getSuperclass();
        }

        obj = invokeAnyGetterByValueType(target, Expr.class);
        if (obj instanceof Expr e) return e;

        obj = readAnyFieldByValueType(target, Expr.class);
        if (obj instanceof Expr e) return e;

        return null;
    }

    private StatementList extractStatementList(Object target, String... getterNames) {
        Object obj = invokeGetter(target, getterNames);
        StatementList sl = coerceToStatementList(obj);
        if (sl != null) return sl;

        obj = readField(target,
                "statementList", "body", "loopBody", "block", "programBlockBody", "statements");
        sl = coerceToStatementList(obj);
        if (sl != null) return sl;

        obj = invokeAnyGetterByValueType(target, StatementList.class);
        sl = coerceToStatementList(obj);
        if (sl != null) return sl;

        obj = invokeAnyGetterByValueType(target, ProgramBlockBody.class);
        sl = coerceToStatementList(obj);
        if (sl != null) return sl;

        obj = readAnyFieldByValueType(target, StatementList.class);
        sl = coerceToStatementList(obj);
        if (sl != null) return sl;

        obj = readAnyFieldByValueType(target, ProgramBlockBody.class);
        sl = coerceToStatementList(obj);
        if (sl != null) return sl;

        Class<?> c = target.getClass();
        while (c != null) {
            for (Field f : c.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    Object value = f.get(target);
                    sl = coerceToStatementList(value);
                    if (sl != null) return sl;
                } catch (Exception ignored) {
                }
            }
            c = c.getSuperclass();
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    private StatementList coerceToStatementList(Object obj) {
        if (obj == null) return null;

        if (obj instanceof StatementList sl) {
            return sl;
        }

        if (obj instanceof ProgramBlockBody pbb) {
            return pbb.getStatementList();
        }

        if (obj instanceof List<?> list) {
            StatementList out = new StatementList();
            for (Object x : list) {
                if (x instanceof Stmt s) {
                    out.addStatement(s);
                }
            }
            return out;
        }

        try {
            Method m = obj.getClass().getMethod("getStatementList");
            Object inner = m.invoke(obj);
            if (inner instanceof StatementList sl) return sl;
        } catch (Exception ignored) {
        }

        return null;
    }

    private String extractLoopVariableName(Object target) {
        Object obj = invokeGetter(target,
                "getVariable", "getLoopVariable", "getIterator", "getControlVariable", "getIterVar", "getVariableNode");
        if (obj instanceof Variable v) return v.getName();
        if (obj instanceof String s) return s;

        Object obj2 = invokeGetter(target, "getVariableName", "getLoopVariableName", "getIteratorName");
        if (obj2 instanceof String s) return s;

        obj = readField(target,
                "variable", "loopVariable", "iterator", "controlVariable", "iterVar", "variableNode");
        if (obj instanceof Variable v) return v.getName();
        if (obj instanceof String s) return s;

        obj = readField(target, "variableName", "loopVariableName", "iteratorName");
        if (obj instanceof String s) return s;

        for (Method m : target.getClass().getMethods()) {
            if (m.getParameterCount() != 0) continue;
            if (m.getName().equals("getClass")) continue;
            try {
                Object value = m.invoke(target);
                if (value instanceof Variable v) return v.getName();
                if (value instanceof String s) return s;
            } catch (Exception ignored) {
            }
        }

        Class<?> c = target.getClass();
        while (c != null) {
            for (Field f : c.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    Object value = f.get(target);
                    if (value instanceof Variable v) return v.getName();
                    if (value instanceof String s) return s;
                } catch (Exception ignored) {
                }
            }
            c = c.getSuperclass();
        }

        return null;
    }

    private boolean isRelationalOperator(String op) {
        return op != null && (op.equals("<") || op.equals(">") || op.equals("<=") || op.equals(">="));
    }

    private String flipRelationalOp(String op) {
        if (op == null) return null;
        return switch (op) {
            case "<" -> ">";
            case ">" -> "<";
            case "<=" -> ">=";
            case ">=" -> "<=";
            default -> op;
        };
    }

    private String joinPrograms(List<String> parts, String sep) {
        List<String> filtered = new ArrayList<>();
        for (String p : parts) {
            if (!isEmptyProgram(p)) filtered.add(p);
        }
        if (filtered.isEmpty()) return "skip";
        return String.join(sep, filtered);
    }

    private boolean isEmptyProgram(String p) {
        return p == null || p.isBlank();
    }

    private String parenthesizeIfNeededForProgram(String p) {
        if (p == null || p.isBlank()) return "skip";
        String t = p.trim();
        if (t.equals("skip")) return "skip";
        if (t.startsWith("(") && t.endsWith(")")) return t;
        if (!t.contains(";\n") && !t.contains("\n")) return t;
        return "(" + t + ")";
    }

    private String indent(String s, String prefix) {
        if (s == null || s.isEmpty()) return prefix;
        String[] lines = s.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            sb.append(prefix).append(lines[i]);
            if (i + 1 < lines.length) sb.append("\n");
        }
        return sb.toString();
    }

    private boolean isBooleanIdentifierLiteral(String name) {
        return name != null && (name.equalsIgnoreCase("true") || name.equalsIgnoreCase("false"));
    }

    private String mapBooleanIdentifierLiteral(String name) {
        if (name == null) return "False";
        return name.equalsIgnoreCase("true") ? "True" : "False";
    }

    private boolean isIntegerLiteralText(String raw) {
        if (raw == null || raw.isBlank()) return false;
        String s = raw.replace("_", "");
        return !s.contains(".") && !s.contains("e") && !s.contains("E");
    }

    private String inferExprType(Expr e) {
        if (e == null) return null;

        if (e instanceof Variable v) {
            String name = v.getName();
            if (isBooleanIdentifierLiteral(name)) return "bool";
            return declaredVarTypes.get(name);
        }

        if (e instanceof BoolValue) {
            return "bool";
        }

        if (e instanceof NumValue nv) {
            return isIntegerLiteralText(nv.getValue()) ? "int" : "real";
        }

        if (e instanceof UnaryExpr ue) {
            String op = ue.getOperator();
            if (op != null && op.equalsIgnoreCase("NOT")) return "bool";
            return inferExprType(ue.getOperand());
        }

        if (e instanceof BinaryExpr be) {
            String op = be.getOperator();
            if (op == null) return null;

            String opU = op.toUpperCase(Locale.ROOT);
            if (opU.equals("OR") || opU.equals("AND") || opU.equals("&") || opU.equals("XOR")
                    || opU.equals("=") || opU.equals("<>") || opU.equals("<")
                    || opU.equals(">") || opU.equals("<=") || opU.equals(">=")) {
                return "bool";
            }

            String lt = inferExprType(be.getFirstOperand());
            String rt = inferExprType(be.getSecondOperand());

            if ("real".equals(lt) || "real".equals(rt)) return "real";
            if ("int".equals(lt) && "int".equals(rt)) return "int";
        }

        return null;
    }

    private boolean isNegativeExpr(Expr e) {
        if (e == null) return false;

        if (e instanceof NumValue nv) {
            return nv.isMinus();
        }

        if (e instanceof UnaryExpr ue) {
            return "-".equals(ue.getOperator());
        }

        String s = renderExpr(e, PREC_LOWEST, inferExprType(e));
        return s != null && s.startsWith("-");
    }

    private String renderPositiveMagnitude(Expr e) {
        if (e == null) return "1";

        if (e instanceof NumValue nv) {
            return nv.getValue() != null ? nv.getValue() : "1";
        }

        if (e instanceof UnaryExpr ue && "-".equals(ue.getOperator())) {
            return renderExpr(ue.getOperand(), PREC_LOWEST, inferExprType(ue.getOperand()));
        }

        String s = renderExpr(e, PREC_LOWEST, inferExprType(e));
        if (s != null && s.startsWith("-")) return s.substring(1).trim();
        return s;
    }

    private Integer tryEvalIntExpr(Expr e) {
        if (e == null) return null;

        if (e instanceof NumValue nv) {
            if (nv.getValue() == null) return null;
            String raw = nv.getValue().replace("_", "");
            if (!isIntegerLiteralText(raw)) return null;
            try {
                int v = Integer.parseInt(raw);
                return nv.isMinus() ? -v : v;
            } catch (NumberFormatException ignored) {
                return null;
            }
        }

        if (e instanceof UnaryExpr ue && "-".equals(ue.getOperator())) {
            Integer inner = tryEvalIntExpr(ue.getOperand());
            return inner == null ? null : -inner;
        }

        return null;
    }

    private Integer tryEvalSignedIntExpr(Expr e) {
        return tryEvalIntExpr(e);
    }

    private NumValue makeNumValue(String value, boolean minus) {
        NumValue n = new NumValue();
        n.setValue(value);
        n.setMinus(minus);
        return n;
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

            if (isBooleanIdentifierLiteral(name)) {
                return mapBooleanIdentifierLiteral(name);
            }

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

            String leftType = inferExprType(be.getFirstOperand());
            String rightType = inferExprType(be.getSecondOperand());

            String mapped;
            if (op != null && op.equals("/") &&
                    ("int".equals(expectedType) || ("int".equals(leftType) && "int".equals(rightType)))) {
                mapped = "div";
            } else {
                mapped = mapBinaryOp(op);
            }

            String left = renderExpr(be.getFirstOperand(), myPrec, leftType);
            String right = renderExpr(be.getSecondOperand(), myPrec, rightType);

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