// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/PLC-IsaVODE/src/main/grammar/PLCtoIsaVODE.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLCtoIsaVODEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLCtoIsaVODEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#source_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_unit(PLCtoIsaVODEParser.Source_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PLCtoIsaVODEParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(PLCtoIsaVODEParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PLCtoIsaVODEParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration(PLCtoIsaVODEParser.ConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#type_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_block(PLCtoIsaVODEParser.Type_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#resource_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_declaration(PLCtoIsaVODEParser.Resource_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#single_resource_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_resource_declaration(PLCtoIsaVODEParser.Single_resource_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#task_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_configuration(PLCtoIsaVODEParser.Task_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#task_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_initialization(PLCtoIsaVODEParser.Task_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#program_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_configuration(PLCtoIsaVODEParser.Program_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(PLCtoIsaVODEParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PLCtoIsaVODEParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(PLCtoIsaVODEParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PLCtoIsaVODEParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PLCtoIsaVODEParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PLCtoIsaVODEParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PLCtoIsaVODEParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLCtoIsaVODEParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(PLCtoIsaVODEParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(PLCtoIsaVODEParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(PLCtoIsaVODEParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(PLCtoIsaVODEParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(PLCtoIsaVODEParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PLCtoIsaVODEParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PLCtoIsaVODEParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#if_then_else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_statement(PLCtoIsaVODEParser.If_then_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PLCtoIsaVODEParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(PLCtoIsaVODEParser.Argument_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PLCtoIsaVODEParser.LiteralContext ctx);
}