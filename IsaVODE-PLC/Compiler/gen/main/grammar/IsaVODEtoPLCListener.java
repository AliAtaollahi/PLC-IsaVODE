// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/IsaVODE-PLC/Compiler/src/main/grammar/IsaVODEtoPLC.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsaVODEtoPLCParser}.
 */
public interface IsaVODEtoPLCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IsaVODEtoPLCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IsaVODEtoPLCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#theoryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTheoryBlock(IsaVODEtoPLCParser.TheoryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#theoryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTheoryBlock(IsaVODEtoPLCParser.TheoryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#importsClause}.
	 * @param ctx the parse tree
	 */
	void enterImportsClause(IsaVODEtoPLCParser.ImportsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#importsClause}.
	 * @param ctx the parse tree
	 */
	void exitImportsClause(IsaVODEtoPLCParser.ImportsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(IsaVODEtoPLCParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(IsaVODEtoPLCParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(IsaVODEtoPLCParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(IsaVODEtoPLCParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(IsaVODEtoPLCParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(IsaVODEtoPLCParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#keywordsClause}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsClause(IsaVODEtoPLCParser.KeywordsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#keywordsClause}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsClause(IsaVODEtoPLCParser.KeywordsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#keywordSpec}.
	 * @param ctx the parse tree
	 */
	void enterKeywordSpec(IsaVODEtoPLCParser.KeywordSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#keywordSpec}.
	 * @param ctx the parse tree
	 */
	void exitKeywordSpec(IsaVODEtoPLCParser.KeywordSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#theoryBody}.
	 * @param ctx the parse tree
	 */
	void enterTheoryBody(IsaVODEtoPLCParser.TheoryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#theoryBody}.
	 * @param ctx the parse tree
	 */
	void exitTheoryBody(IsaVODEtoPLCParser.TheoryBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#contextBlock}.
	 * @param ctx the parse tree
	 */
	void enterContextBlock(IsaVODEtoPLCParser.ContextBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#contextBlock}.
	 * @param ctx the parse tree
	 */
	void exitContextBlock(IsaVODEtoPLCParser.ContextBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#contextBody}.
	 * @param ctx the parse tree
	 */
	void enterContextBody(IsaVODEtoPLCParser.ContextBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#contextBody}.
	 * @param ctx the parse tree
	 */
	void exitContextBody(IsaVODEtoPLCParser.ContextBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#definitionDecl}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionDecl(IsaVODEtoPLCParser.DefinitionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#definitionDecl}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionDecl(IsaVODEtoPLCParser.DefinitionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#dataspaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterDataspaceDecl(IsaVODEtoPLCParser.DataspaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#dataspaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitDataspaceDecl(IsaVODEtoPLCParser.DataspaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#dataspaceBody}.
	 * @param ctx the parse tree
	 */
	void enterDataspaceBody(IsaVODEtoPLCParser.DataspaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#dataspaceBody}.
	 * @param ctx the parse tree
	 */
	void exitDataspaceBody(IsaVODEtoPLCParser.DataspaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#constantsClause}.
	 * @param ctx the parse tree
	 */
	void enterConstantsClause(IsaVODEtoPLCParser.ConstantsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#constantsClause}.
	 * @param ctx the parse tree
	 */
	void exitConstantsClause(IsaVODEtoPLCParser.ConstantsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#constantDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstantDecl(IsaVODEtoPLCParser.ConstantDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#constantDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstantDecl(IsaVODEtoPLCParser.ConstantDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#assumesClause}.
	 * @param ctx the parse tree
	 */
	void enterAssumesClause(IsaVODEtoPLCParser.AssumesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#assumesClause}.
	 * @param ctx the parse tree
	 */
	void exitAssumesClause(IsaVODEtoPLCParser.AssumesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#assumptionDecl}.
	 * @param ctx the parse tree
	 */
	void enterAssumptionDecl(IsaVODEtoPLCParser.AssumptionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#assumptionDecl}.
	 * @param ctx the parse tree
	 */
	void exitAssumptionDecl(IsaVODEtoPLCParser.AssumptionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#variablesClause}.
	 * @param ctx the parse tree
	 */
	void enterVariablesClause(IsaVODEtoPLCParser.VariablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#variablesClause}.
	 * @param ctx the parse tree
	 */
	void exitVariablesClause(IsaVODEtoPLCParser.VariablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(IsaVODEtoPLCParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(IsaVODEtoPLCParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#abbrevDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevDecl(IsaVODEtoPLCParser.AbbrevDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#abbrevDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevDecl(IsaVODEtoPLCParser.AbbrevDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#printSpec}.
	 * @param ctx the parse tree
	 */
	void enterPrintSpec(IsaVODEtoPLCParser.PrintSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#printSpec}.
	 * @param ctx the parse tree
	 */
	void exitPrintSpec(IsaVODEtoPLCParser.PrintSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#precedenceAnn}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceAnn(IsaVODEtoPLCParser.PrecedenceAnnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#precedenceAnn}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceAnn(IsaVODEtoPLCParser.PrecedenceAnnContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#innerPrec}.
	 * @param ctx the parse tree
	 */
	void enterInnerPrec(IsaVODEtoPLCParser.InnerPrecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#innerPrec}.
	 * @param ctx the parse tree
	 */
	void exitInnerPrec(IsaVODEtoPLCParser.InnerPrecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#mixfixForm}.
	 * @param ctx the parse tree
	 */
	void enterMixfixForm(IsaVODEtoPLCParser.MixfixFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#mixfixForm}.
	 * @param ctx the parse tree
	 */
	void exitMixfixForm(IsaVODEtoPLCParser.MixfixFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaDecl}.
	 * @param ctx the parse tree
	 */
	void enterLemmaDecl(IsaVODEtoPLCParser.LemmaDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaDecl}.
	 * @param ctx the parse tree
	 */
	void exitLemmaDecl(IsaVODEtoPLCParser.LemmaDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaPrefix}.
	 * @param ctx the parse tree
	 */
	void enterLemmaPrefix(IsaVODEtoPLCParser.LemmaPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaPrefix}.
	 * @param ctx the parse tree
	 */
	void exitLemmaPrefix(IsaVODEtoPLCParser.LemmaPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaNameAndAttrs}.
	 * @param ctx the parse tree
	 */
	void enterLemmaNameAndAttrs(IsaVODEtoPLCParser.LemmaNameAndAttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaNameAndAttrs}.
	 * @param ctx the parse tree
	 */
	void exitLemmaNameAndAttrs(IsaVODEtoPLCParser.LemmaNameAndAttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(IsaVODEtoPLCParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(IsaVODEtoPLCParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#attrList}.
	 * @param ctx the parse tree
	 */
	void enterAttrList(IsaVODEtoPLCParser.AttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#attrList}.
	 * @param ctx the parse tree
	 */
	void exitAttrList(IsaVODEtoPLCParser.AttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(IsaVODEtoPLCParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(IsaVODEtoPLCParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHead}.
	 * @param ctx the parse tree
	 */
	void enterLemmaHead(IsaVODEtoPLCParser.LemmaHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHead}.
	 * @param ctx the parse tree
	 */
	void exitLemmaHead(IsaVODEtoPLCParser.LemmaHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaAssumesShows}.
	 * @param ctx the parse tree
	 */
	void enterLemmaAssumesShows(IsaVODEtoPLCParser.LemmaAssumesShowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaAssumesShows}.
	 * @param ctx the parse tree
	 */
	void exitLemmaAssumesShows(IsaVODEtoPLCParser.LemmaAssumesShowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaProof}.
	 * @param ctx the parse tree
	 */
	void enterLemmaProof(IsaVODEtoPLCParser.LemmaProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaProof}.
	 * @param ctx the parse tree
	 */
	void exitLemmaProof(IsaVODEtoPLCParser.LemmaProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#proofScript}.
	 * @param ctx the parse tree
	 */
	void enterProofScript(IsaVODEtoPLCParser.ProofScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#proofScript}.
	 * @param ctx the parse tree
	 */
	void exitProofScript(IsaVODEtoPLCParser.ProofScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#proofItems}.
	 * @param ctx the parse tree
	 */
	void enterProofItems(IsaVODEtoPLCParser.ProofItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#proofItems}.
	 * @param ctx the parse tree
	 */
	void exitProofItems(IsaVODEtoPLCParser.ProofItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#proofItem}.
	 * @param ctx the parse tree
	 */
	void enterProofItem(IsaVODEtoPLCParser.ProofItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#proofItem}.
	 * @param ctx the parse tree
	 */
	void exitProofItem(IsaVODEtoPLCParser.ProofItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#antiquotBlock}.
	 * @param ctx the parse tree
	 */
	void enterAntiquotBlock(IsaVODEtoPLCParser.AntiquotBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#antiquotBlock}.
	 * @param ctx the parse tree
	 */
	void exitAntiquotBlock(IsaVODEtoPLCParser.AntiquotBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#antiquotContent}.
	 * @param ctx the parse tree
	 */
	void enterAntiquotContent(IsaVODEtoPLCParser.AntiquotContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#antiquotContent}.
	 * @param ctx the parse tree
	 */
	void exitAntiquotContent(IsaVODEtoPLCParser.AntiquotContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#antiquotUnit}.
	 * @param ctx the parse tree
	 */
	void enterAntiquotUnit(IsaVODEtoPLCParser.AntiquotUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#antiquotUnit}.
	 * @param ctx the parse tree
	 */
	void exitAntiquotUnit(IsaVODEtoPLCParser.AntiquotUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#mlBlock}.
	 * @param ctx the parse tree
	 */
	void enterMlBlock(IsaVODEtoPLCParser.MlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#mlBlock}.
	 * @param ctx the parse tree
	 */
	void exitMlBlock(IsaVODEtoPLCParser.MlBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(IsaVODEtoPLCParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(IsaVODEtoPLCParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtom(IsaVODEtoPLCParser.TypeAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtom(IsaVODEtoPLCParser.TypeAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(IsaVODEtoPLCParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(IsaVODEtoPLCParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#idseg}.
	 * @param ctx the parse tree
	 */
	void enterIdseg(IsaVODEtoPLCParser.IdsegContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#idseg}.
	 * @param ctx the parse tree
	 */
	void exitIdseg(IsaVODEtoPLCParser.IdsegContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#idsegOrNum}.
	 * @param ctx the parse tree
	 */
	void enterIdsegOrNum(IsaVODEtoPLCParser.IdsegOrNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#idsegOrNum}.
	 * @param ctx the parse tree
	 */
	void exitIdsegOrNum(IsaVODEtoPLCParser.IdsegOrNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#numberList}.
	 * @param ctx the parse tree
	 */
	void enterNumberList(IsaVODEtoPLCParser.NumberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#numberList}.
	 * @param ctx the parse tree
	 */
	void exitNumberList(IsaVODEtoPLCParser.NumberListContext ctx);
}