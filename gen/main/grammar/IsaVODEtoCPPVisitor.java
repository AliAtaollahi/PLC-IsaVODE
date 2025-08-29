// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/src/main/grammar/IsaVODEtoCPP.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IsaVODEtoCPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IsaVODEtoCPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(IsaVODEtoCPPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#dataspaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataspaceDecl(IsaVODEtoCPPParser.DataspaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#dataspaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataspaceBody(IsaVODEtoCPPParser.DataspaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#constantsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantsClause(IsaVODEtoCPPParser.ConstantsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#constantDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDecl(IsaVODEtoCPPParser.ConstantDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#assumesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumesClause(IsaVODEtoCPPParser.AssumesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#assumptionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumptionDecl(IsaVODEtoCPPParser.AssumptionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#variablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesClause(IsaVODEtoCPPParser.VariablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(IsaVODEtoCPPParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#abbrevDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrevDecl(IsaVODEtoCPPParser.AbbrevDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#printSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSpec(IsaVODEtoCPPParser.PrintSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#precedenceAnn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedenceAnn(IsaVODEtoCPPParser.PrecedenceAnnContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#innerPrec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerPrec(IsaVODEtoCPPParser.InnerPrecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#mixfixForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixfixForm(IsaVODEtoCPPParser.MixfixFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#antiquotBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntiquotBlock(IsaVODEtoCPPParser.AntiquotBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#antiquotContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntiquotContent(IsaVODEtoCPPParser.AntiquotContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#antiquotUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntiquotUnit(IsaVODEtoCPPParser.AntiquotUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(IsaVODEtoCPPParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#typeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtom(IsaVODEtoCPPParser.TypeAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(IsaVODEtoCPPParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#idseg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdseg(IsaVODEtoCPPParser.IdsegContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#idsegOrNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdsegOrNum(IsaVODEtoCPPParser.IdsegOrNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsaVODEtoCPPParser#numberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberList(IsaVODEtoCPPParser.NumberListContext ctx);
}