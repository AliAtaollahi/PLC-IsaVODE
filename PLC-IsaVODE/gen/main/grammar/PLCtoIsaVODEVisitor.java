// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/PLC-IsaVODE/src/main/grammar/PLCtoIsaVODE.g4 by ANTLR 4.13.1
package main.grammar;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.Stmt.*;
    import main.ast.nodes.expr.*;
    import main.ast.nodes.expr.value.*;

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
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#interval_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_time(PLCtoIsaVODEParser.Interval_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#time_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_unit(PLCtoIsaVODEParser.Time_unitContext ctx);
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
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_rule(PLCtoIsaVODEParser.Type_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PLCtoIsaVODEParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#program_block_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_block_body(PLCtoIsaVODEParser.Program_block_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(PLCtoIsaVODEParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLCtoIsaVODEParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PLCtoIsaVODEParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#if_then_else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_statement(PLCtoIsaVODEParser.If_then_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PLCtoIsaVODEParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PLCtoIsaVODEParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#equ_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu_operator(PLCtoIsaVODEParser.Equ_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(PLCtoIsaVODEParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#add_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_operator(PLCtoIsaVODEParser.Add_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#multiply_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_operator(PLCtoIsaVODEParser.Multiply_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(PLCtoIsaVODEParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(PLCtoIsaVODEParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PLCtoIsaVODEParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(PLCtoIsaVODEParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(PLCtoIsaVODEParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLCtoIsaVODEParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(PLCtoIsaVODEParser.Integer_literalContext ctx);
}