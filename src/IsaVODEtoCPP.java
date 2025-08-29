import main.ast.nodes.Program;
import main.grammar.IsaVODEtoCPPLexer;
import main.grammar.IsaVODEtoCPPParser;
import main.symbolTable.SymbolTable;
import main.visitor.NameAnalyzer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;

public class IsaVODEtoCPP {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        IsaVODEtoCPPLexer IsaVODEtoCPPLexer = new IsaVODEtoCPPLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(IsaVODEtoCPPLexer);
        IsaVODEtoCPPParser flParser = new IsaVODEtoCPPParser(tokens);
        Program program = flParser.program().programRet;
        System.out.println();

//        TestVisitor my_visitor = new TestVisitor();
//        my_visitor.visit(program);

        NameAnalyzer my_name_analyzer = new NameAnalyzer();
        my_name_analyzer.visit(program);

        SymbolTable.root.hashCode();
        System.out.println();
    }
}