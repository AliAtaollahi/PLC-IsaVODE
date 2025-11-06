// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/IsaVODE-PLC/Compiler/src/main/grammar/IsaVODEtoPLC.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IsaVODEtoPLCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IsaVODEtoPLCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(IsaVODEtoPLCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#topItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopItem(IsaVODEtoPLCParser.TopItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#theoryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoryBlock(IsaVODEtoPLCParser.TheoryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#importsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsClause(IsaVODEtoPLCParser.ImportsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(IsaVODEtoPLCParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(IsaVODEtoPLCParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(IsaVODEtoPLCParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#keywordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsClause(IsaVODEtoPLCParser.KeywordsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#keywordSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordSpec(IsaVODEtoPLCParser.KeywordSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#theoryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoryBody(IsaVODEtoPLCParser.TheoryBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#sectionCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionCommand(IsaVODEtoPLCParser.SectionCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#subsectionCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsectionCommand(IsaVODEtoPLCParser.SubsectionCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#textCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextCommand(IsaVODEtoPLCParser.TextCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#contextBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextBlock(IsaVODEtoPLCParser.ContextBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#contextBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextBody(IsaVODEtoPLCParser.ContextBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#bundleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBundleBlock(IsaVODEtoPLCParser.BundleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#bundleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBundleBody(IsaVODEtoPLCParser.BundleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#definitionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionDecl(IsaVODEtoPLCParser.DefinitionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#dataspaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataspaceDecl(IsaVODEtoPLCParser.DataspaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#dataspaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataspaceBody(IsaVODEtoPLCParser.DataspaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#constantsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantsClause(IsaVODEtoPLCParser.ConstantsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#constantDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDecl(IsaVODEtoPLCParser.ConstantDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#assumesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumesClause(IsaVODEtoPLCParser.AssumesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#assumptionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumptionDecl(IsaVODEtoPLCParser.AssumptionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#variablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesClause(IsaVODEtoPLCParser.VariablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(IsaVODEtoPLCParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#typeSynDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSynDecl(IsaVODEtoPLCParser.TypeSynDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#abbrevDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrevDecl(IsaVODEtoPLCParser.AbbrevDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#printSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSpec(IsaVODEtoPLCParser.PrintSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#precedenceAnn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedenceAnn(IsaVODEtoPLCParser.PrecedenceAnnContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#innerPrec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerPrec(IsaVODEtoPLCParser.InnerPrecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#mixfixForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixfixForm(IsaVODEtoPLCParser.MixfixFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaDecl(IsaVODEtoPLCParser.LemmaDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaPrefix(IsaVODEtoPLCParser.LemmaPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaNameAndAttrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaNameAndAttrs(IsaVODEtoPLCParser.LemmaNameAndAttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(IsaVODEtoPLCParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#attrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrList(IsaVODEtoPLCParser.AttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(IsaVODEtoPLCParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaHead(IsaVODEtoPLCParser.LemmaHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaAssumesShows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaAssumesShows(IsaVODEtoPLCParser.LemmaAssumesShowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaFacts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaFacts(IsaVODEtoPLCParser.LemmaFactsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmaProof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaProof(IsaVODEtoPLCParser.LemmaProofContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#proofScript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofScript(IsaVODEtoPLCParser.ProofScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#proofItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofItems(IsaVODEtoPLCParser.ProofItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#proofItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofItem(IsaVODEtoPLCParser.ProofItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#lemmasDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmasDecl(IsaVODEtoPLCParser.LemmasDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#antiquotBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntiquotBlock(IsaVODEtoPLCParser.AntiquotBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#antiquotContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntiquotContent(IsaVODEtoPLCParser.AntiquotContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#antiquotUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntiquotUnit(IsaVODEtoPLCParser.AntiquotUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#mlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlBlock(IsaVODEtoPLCParser.MlBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#mlFileDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlFileDecl(IsaVODEtoPLCParser.MlFileDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#syntaxDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaxDecl(IsaVODEtoPLCParser.SyntaxDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#syntaxEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaxEntry(IsaVODEtoPLCParser.SyntaxEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#translationsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationsDecl(IsaVODEtoPLCParser.TranslationsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#translationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationRule(IsaVODEtoPLCParser.TranslationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#unbundleDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnbundleDecl(IsaVODEtoPLCParser.UnbundleDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#declareDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareDecl(IsaVODEtoPLCParser.DeclareDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#declItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclItem(IsaVODEtoPLCParser.DeclItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#noNotationDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoNotationDecl(IsaVODEtoPLCParser.NoNotationDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#noNotationTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoNotationTail(IsaVODEtoPLCParser.NoNotationTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#noNotationToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoNotationToken(IsaVODEtoPLCParser.NoNotationTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#notationDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotationDecl(IsaVODEtoPLCParser.NotationDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#namedTheoremsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedTheoremsDecl(IsaVODEtoPLCParser.NamedTheoremsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#exprConstructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConstructorDecl(IsaVODEtoPLCParser.ExprConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(IsaVODEtoPLCParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#typeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtom(IsaVODEtoPLCParser.TypeAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(IsaVODEtoPLCParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#idseg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdseg(IsaVODEtoPLCParser.IdsegContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#idsegOrNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdsegOrNum(IsaVODEtoPLCParser.IdsegOrNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoPLCParser#numberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberList(IsaVODEtoPLCParser.NumberListContext ctx);
}