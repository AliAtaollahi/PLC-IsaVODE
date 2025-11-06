import main.ast.nodes.Program;
import main.grammar.IsaVODEtoPLCLexer;
import main.grammar.IsaVODEtoPLCParser;
import main.symbolTable.SymbolTable;
import main.visitor.NameAnalyzer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;

public class IsaVODEtoPLC {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        IsaVODEtoPLCLexer IsaVODEtoPLCLexer = new IsaVODEtoPLCLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(IsaVODEtoPLCLexer);
        IsaVODEtoPLCParser flParser = new IsaVODEtoPLCParser(tokens);
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