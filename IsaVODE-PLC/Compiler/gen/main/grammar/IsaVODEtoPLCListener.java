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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#topItem}.
	 * @param ctx the parse tree
	 */
	void enterTopItem(IsaVODEtoPLCParser.TopItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#topItem}.
	 * @param ctx the parse tree
	 */
	void exitTopItem(IsaVODEtoPLCParser.TopItemContext ctx);
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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#sectionCommand}.
	 * @param ctx the parse tree
	 */
	void enterSectionCommand(IsaVODEtoPLCParser.SectionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#sectionCommand}.
	 * @param ctx the parse tree
	 */
	void exitSectionCommand(IsaVODEtoPLCParser.SectionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#subsectionCommand}.
	 * @param ctx the parse tree
	 */
	void enterSubsectionCommand(IsaVODEtoPLCParser.SubsectionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#subsectionCommand}.
	 * @param ctx the parse tree
	 */
	void exitSubsectionCommand(IsaVODEtoPLCParser.SubsectionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#textCommand}.
	 * @param ctx the parse tree
	 */
	void enterTextCommand(IsaVODEtoPLCParser.TextCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#textCommand}.
	 * @param ctx the parse tree
	 */
	void exitTextCommand(IsaVODEtoPLCParser.TextCommandContext ctx);
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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#bundleBlock}.
	 * @param ctx the parse tree
	 */
	void enterBundleBlock(IsaVODEtoPLCParser.BundleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#bundleBlock}.
	 * @param ctx the parse tree
	 */
	void exitBundleBlock(IsaVODEtoPLCParser.BundleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#bundleBody}.
	 * @param ctx the parse tree
	 */
	void enterBundleBody(IsaVODEtoPLCParser.BundleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#bundleBody}.
	 * @param ctx the parse tree
	 */
	void exitBundleBody(IsaVODEtoPLCParser.BundleBodyContext ctx);
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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#typeSynDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeSynDecl(IsaVODEtoPLCParser.TypeSynDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#typeSynDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeSynDecl(IsaVODEtoPLCParser.TypeSynDeclContext ctx);
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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHeadGeneric}.
	 * @param ctx the parse tree
	 */
	void enterLemmaHeadGeneric(IsaVODEtoPLCParser.LemmaHeadGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHeadGeneric}.
	 * @param ctx the parse tree
	 */
	void exitLemmaHeadGeneric(IsaVODEtoPLCParser.LemmaHeadGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHeadToken}.
	 * @param ctx the parse tree
	 */
	void enterLemmaHeadToken(IsaVODEtoPLCParser.LemmaHeadTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHeadToken}.
	 * @param ctx the parse tree
	 */
	void exitLemmaHeadToken(IsaVODEtoPLCParser.LemmaHeadTokenContext ctx);
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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#lemmasDecl}.
	 * @param ctx the parse tree
	 */
	void enterLemmasDecl(IsaVODEtoPLCParser.LemmasDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#lemmasDecl}.
	 * @param ctx the parse tree
	 */
	void exitLemmasDecl(IsaVODEtoPLCParser.LemmasDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(IsaVODEtoPLCParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(IsaVODEtoPLCParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#methodSetupDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodSetupDecl(IsaVODEtoPLCParser.MethodSetupDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#methodSetupDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodSetupDecl(IsaVODEtoPLCParser.MethodSetupDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(IsaVODEtoPLCParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(IsaVODEtoPLCParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#methodAtom}.
	 * @param ctx the parse tree
	 */
	void enterMethodAtom(IsaVODEtoPLCParser.MethodAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#methodAtom}.
	 * @param ctx the parse tree
	 */
	void exitMethodAtom(IsaVODEtoPLCParser.MethodAtomContext ctx);
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
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#mlFileDecl}.
	 * @param ctx the parse tree
	 */
	void enterMlFileDecl(IsaVODEtoPLCParser.MlFileDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#mlFileDecl}.
	 * @param ctx the parse tree
	 */
	void exitMlFileDecl(IsaVODEtoPLCParser.MlFileDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#syntaxDecl}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxDecl(IsaVODEtoPLCParser.SyntaxDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#syntaxDecl}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxDecl(IsaVODEtoPLCParser.SyntaxDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#syntaxEntry}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxEntry(IsaVODEtoPLCParser.SyntaxEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#syntaxEntry}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxEntry(IsaVODEtoPLCParser.SyntaxEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#translationsDecl}.
	 * @param ctx the parse tree
	 */
	void enterTranslationsDecl(IsaVODEtoPLCParser.TranslationsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#translationsDecl}.
	 * @param ctx the parse tree
	 */
	void exitTranslationsDecl(IsaVODEtoPLCParser.TranslationsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#translationRule}.
	 * @param ctx the parse tree
	 */
	void enterTranslationRule(IsaVODEtoPLCParser.TranslationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#translationRule}.
	 * @param ctx the parse tree
	 */
	void exitTranslationRule(IsaVODEtoPLCParser.TranslationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#unbundleDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnbundleDecl(IsaVODEtoPLCParser.UnbundleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#unbundleDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnbundleDecl(IsaVODEtoPLCParser.UnbundleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#declareDecl}.
	 * @param ctx the parse tree
	 */
	void enterDeclareDecl(IsaVODEtoPLCParser.DeclareDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#declareDecl}.
	 * @param ctx the parse tree
	 */
	void exitDeclareDecl(IsaVODEtoPLCParser.DeclareDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#declTail}.
	 * @param ctx the parse tree
	 */
	void enterDeclTail(IsaVODEtoPLCParser.DeclTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#declTail}.
	 * @param ctx the parse tree
	 */
	void exitDeclTail(IsaVODEtoPLCParser.DeclTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#declAtom}.
	 * @param ctx the parse tree
	 */
	void enterDeclAtom(IsaVODEtoPLCParser.DeclAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#declAtom}.
	 * @param ctx the parse tree
	 */
	void exitDeclAtom(IsaVODEtoPLCParser.DeclAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#noNotationDecl}.
	 * @param ctx the parse tree
	 */
	void enterNoNotationDecl(IsaVODEtoPLCParser.NoNotationDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#noNotationDecl}.
	 * @param ctx the parse tree
	 */
	void exitNoNotationDecl(IsaVODEtoPLCParser.NoNotationDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#noNotationTail}.
	 * @param ctx the parse tree
	 */
	void enterNoNotationTail(IsaVODEtoPLCParser.NoNotationTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#noNotationTail}.
	 * @param ctx the parse tree
	 */
	void exitNoNotationTail(IsaVODEtoPLCParser.NoNotationTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#noNotationToken}.
	 * @param ctx the parse tree
	 */
	void enterNoNotationToken(IsaVODEtoPLCParser.NoNotationTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#noNotationToken}.
	 * @param ctx the parse tree
	 */
	void exitNoNotationToken(IsaVODEtoPLCParser.NoNotationTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#notationDecl}.
	 * @param ctx the parse tree
	 */
	void enterNotationDecl(IsaVODEtoPLCParser.NotationDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#notationDecl}.
	 * @param ctx the parse tree
	 */
	void exitNotationDecl(IsaVODEtoPLCParser.NotationDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#namedTheoremsDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedTheoremsDecl(IsaVODEtoPLCParser.NamedTheoremsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#namedTheoremsDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedTheoremsDecl(IsaVODEtoPLCParser.NamedTheoremsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsaVODEtoPLCParser#exprConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterExprConstructorDecl(IsaVODEtoPLCParser.ExprConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsaVODEtoPLCParser#exprConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitExprConstructorDecl(IsaVODEtoPLCParser.ExprConstructorDeclContext ctx);
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