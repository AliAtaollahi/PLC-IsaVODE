// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/src/main/grammar/IsaVODEtoCPP.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsaVODEtoCPPParser}.
 */
public interface IsaVODEtoCPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IsaVODEtoCPPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IsaVODEtoCPPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#theoryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTheoryBlock(IsaVODEtoCPPParser.TheoryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#theoryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTheoryBlock(IsaVODEtoCPPParser.TheoryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#importsClause}.
	 * @param ctx the parse tree
	 */
	void enterImportsClause(IsaVODEtoCPPParser.ImportsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#importsClause}.
	 * @param ctx the parse tree
	 */
	void exitImportsClause(IsaVODEtoCPPParser.ImportsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(IsaVODEtoCPPParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(IsaVODEtoCPPParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(IsaVODEtoCPPParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(IsaVODEtoCPPParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(IsaVODEtoCPPParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(IsaVODEtoCPPParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#theoryBody}.
	 * @param ctx the parse tree
	 */
	void enterTheoryBody(IsaVODEtoCPPParser.TheoryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#theoryBody}.
	 * @param ctx the parse tree
	 */
	void exitTheoryBody(IsaVODEtoCPPParser.TheoryBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#contextBlock}.
	 * @param ctx the parse tree
	 */
	void enterContextBlock(IsaVODEtoCPPParser.ContextBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#contextBlock}.
	 * @param ctx the parse tree
	 */
	void exitContextBlock(IsaVODEtoCPPParser.ContextBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#contextBody}.
	 * @param ctx the parse tree
	 */
	void enterContextBody(IsaVODEtoCPPParser.ContextBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#contextBody}.
	 * @param ctx the parse tree
	 */
	void exitContextBody(IsaVODEtoCPPParser.ContextBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#definitionDecl}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionDecl(IsaVODEtoCPPParser.DefinitionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#definitionDecl}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionDecl(IsaVODEtoCPPParser.DefinitionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#dataspaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterDataspaceDecl(IsaVODEtoCPPParser.DataspaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#dataspaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitDataspaceDecl(IsaVODEtoCPPParser.DataspaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#dataspaceBody}.
	 * @param ctx the parse tree
	 */
	void enterDataspaceBody(IsaVODEtoCPPParser.DataspaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#dataspaceBody}.
	 * @param ctx the parse tree
	 */
	void exitDataspaceBody(IsaVODEtoCPPParser.DataspaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#constantsClause}.
	 * @param ctx the parse tree
	 */
	void enterConstantsClause(IsaVODEtoCPPParser.ConstantsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#constantsClause}.
	 * @param ctx the parse tree
	 */
	void exitConstantsClause(IsaVODEtoCPPParser.ConstantsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#constantDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstantDecl(IsaVODEtoCPPParser.ConstantDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#constantDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstantDecl(IsaVODEtoCPPParser.ConstantDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#assumesClause}.
	 * @param ctx the parse tree
	 */
	void enterAssumesClause(IsaVODEtoCPPParser.AssumesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#assumesClause}.
	 * @param ctx the parse tree
	 */
	void exitAssumesClause(IsaVODEtoCPPParser.AssumesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#assumptionDecl}.
	 * @param ctx the parse tree
	 */
	void enterAssumptionDecl(IsaVODEtoCPPParser.AssumptionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#assumptionDecl}.
	 * @param ctx the parse tree
	 */
	void exitAssumptionDecl(IsaVODEtoCPPParser.AssumptionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#variablesClause}.
	 * @param ctx the parse tree
	 */
	void enterVariablesClause(IsaVODEtoCPPParser.VariablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#variablesClause}.
	 * @param ctx the parse tree
	 */
	void exitVariablesClause(IsaVODEtoCPPParser.VariablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(IsaVODEtoCPPParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(IsaVODEtoCPPParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#abbrevDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevDecl(IsaVODEtoCPPParser.AbbrevDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#abbrevDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevDecl(IsaVODEtoCPPParser.AbbrevDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#printSpec}.
	 * @param ctx the parse tree
	 */
	void enterPrintSpec(IsaVODEtoCPPParser.PrintSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#printSpec}.
	 * @param ctx the parse tree
	 */
	void exitPrintSpec(IsaVODEtoCPPParser.PrintSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#precedenceAnn}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceAnn(IsaVODEtoCPPParser.PrecedenceAnnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#precedenceAnn}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceAnn(IsaVODEtoCPPParser.PrecedenceAnnContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#innerPrec}.
	 * @param ctx the parse tree
	 */
	void enterInnerPrec(IsaVODEtoCPPParser.InnerPrecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#innerPrec}.
	 * @param ctx the parse tree
	 */
	void exitInnerPrec(IsaVODEtoCPPParser.InnerPrecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#mixfixForm}.
	 * @param ctx the parse tree
	 */
	void enterMixfixForm(IsaVODEtoCPPParser.MixfixFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#mixfixForm}.
	 * @param ctx the parse tree
	 */
	void exitMixfixForm(IsaVODEtoCPPParser.MixfixFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#lemmaDecl}.
	 * @param ctx the parse tree
	 */
	void enterLemmaDecl(IsaVODEtoCPPParser.LemmaDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#lemmaDecl}.
	 * @param ctx the parse tree
	 */
	void exitLemmaDecl(IsaVODEtoCPPParser.LemmaDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#lemmaHead}.
	 * @param ctx the parse tree
	 */
	void enterLemmaHead(IsaVODEtoCPPParser.LemmaHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#lemmaHead}.
	 * @param ctx the parse tree
	 */
	void exitLemmaHead(IsaVODEtoCPPParser.LemmaHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#lemmaAssumesShows}.
	 * @param ctx the parse tree
	 */
	void enterLemmaAssumesShows(IsaVODEtoCPPParser.LemmaAssumesShowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#lemmaAssumesShows}.
	 * @param ctx the parse tree
	 */
	void exitLemmaAssumesShows(IsaVODEtoCPPParser.LemmaAssumesShowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#lemmaProof}.
	 * @param ctx the parse tree
	 */
	void enterLemmaProof(IsaVODEtoCPPParser.LemmaProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#lemmaProof}.
	 * @param ctx the parse tree
	 */
	void exitLemmaProof(IsaVODEtoCPPParser.LemmaProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#proofScript}.
	 * @param ctx the parse tree
	 */
	void enterProofScript(IsaVODEtoCPPParser.ProofScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#proofScript}.
	 * @param ctx the parse tree
	 */
	void exitProofScript(IsaVODEtoCPPParser.ProofScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#proofItems}.
	 * @param ctx the parse tree
	 */
	void enterProofItems(IsaVODEtoCPPParser.ProofItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#proofItems}.
	 * @param ctx the parse tree
	 */
	void exitProofItems(IsaVODEtoCPPParser.ProofItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#proofItem}.
	 * @param ctx the parse tree
	 */
	void enterProofItem(IsaVODEtoCPPParser.ProofItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#proofItem}.
	 * @param ctx the parse tree
	 */
	void exitProofItem(IsaVODEtoCPPParser.ProofItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#antiquotBlock}.
	 * @param ctx the parse tree
	 */
	void enterAntiquotBlock(IsaVODEtoCPPParser.AntiquotBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#antiquotBlock}.
	 * @param ctx the parse tree
	 */
	void exitAntiquotBlock(IsaVODEtoCPPParser.AntiquotBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#antiquotContent}.
	 * @param ctx the parse tree
	 */
	void enterAntiquotContent(IsaVODEtoCPPParser.AntiquotContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#antiquotContent}.
	 * @param ctx the parse tree
	 */
	void exitAntiquotContent(IsaVODEtoCPPParser.AntiquotContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#antiquotUnit}.
	 * @param ctx the parse tree
	 */
	void enterAntiquotUnit(IsaVODEtoCPPParser.AntiquotUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#antiquotUnit}.
	 * @param ctx the parse tree
	 */
	void exitAntiquotUnit(IsaVODEtoCPPParser.AntiquotUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(IsaVODEtoCPPParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(IsaVODEtoCPPParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtom(IsaVODEtoCPPParser.TypeAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtom(IsaVODEtoCPPParser.TypeAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(IsaVODEtoCPPParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(IsaVODEtoCPPParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#idseg}.
	 * @param ctx the parse tree
	 */
	void enterIdseg(IsaVODEtoCPPParser.IdsegContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#idseg}.
	 * @param ctx the parse tree
	 */
	void exitIdseg(IsaVODEtoCPPParser.IdsegContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#idsegOrNum}.
	 * @param ctx the parse tree
	 */
	void enterIdsegOrNum(IsaVODEtoCPPParser.IdsegOrNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#idsegOrNum}.
	 * @param ctx the parse tree
	 */
	void exitIdsegOrNum(IsaVODEtoCPPParser.IdsegOrNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoCPPParser#numberList}.
	 * @param ctx the parse tree
	 */
	void enterNumberList(IsaVODEtoCPPParser.NumberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoCPPParser#numberList}.
	 * @param ctx the parse tree
	 */
	void exitNumberList(IsaVODEtoCPPParser.NumberListContext ctx);
}