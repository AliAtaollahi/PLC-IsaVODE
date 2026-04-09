import main.ast.nodes.declaration.Program;
import main.ast.nodes.declaration.SourceUnit;
import main.grammar.PLCtoIsaVODELexer;
import main.grammar.PLCtoIsaVODEParser;
import main.visitor.CodeGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;

public class PLCtoIsaVODE {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        PLCtoIsaVODELexer PLCtoIsaVODELexer = new PLCtoIsaVODELexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(PLCtoIsaVODELexer);
        PLCtoIsaVODEParser flParser = new PLCtoIsaVODEParser(tokens);
        SourceUnit source_unit = flParser.source_unit().sourceUnitRet;

        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.visit(source_unit);
        System.out.println();
    }
}