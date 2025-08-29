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
}