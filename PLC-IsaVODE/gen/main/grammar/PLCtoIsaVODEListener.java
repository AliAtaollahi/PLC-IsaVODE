// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/PLC-IsaVODE/src/main/grammar/PLCtoIsaVODE.g4 by ANTLR 4.13.1
package main.grammar;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.Stmt.*;
    import main.ast.nodes.expr.*;
    import main.ast.nodes.expr.value.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLCtoIsaVODEParser}.
 */
public interface PLCtoIsaVODEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLCtoIsaVODEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLCtoIsaVODEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#configuration}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration(PLCtoIsaVODEParser.ConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#configuration}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration(PLCtoIsaVODEParser.ConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterResource_declaration(PLCtoIsaVODEParser.Resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitResource_declaration(PLCtoIsaVODEParser.Resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#single_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_resource_declaration(PLCtoIsaVODEParser.Single_resource_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#single_resource_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_resource_declaration(PLCtoIsaVODEParser.Single_resource_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#task_configuration}.
	 * @param ctx the parse tree
	 */
	void enterTask_configuration(PLCtoIsaVODEParser.Task_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#task_configuration}.
	 * @param ctx the parse tree
	 */
	void exitTask_configuration(PLCtoIsaVODEParser.Task_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#task_initialization}.
	 * @param ctx the parse tree
	 */
	void enterTask_initialization(PLCtoIsaVODEParser.Task_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#task_initialization}.
	 * @param ctx the parse tree
	 */
	void exitTask_initialization(PLCtoIsaVODEParser.Task_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#interval_time}.
	 * @param ctx the parse tree
	 */
	void enterInterval_time(PLCtoIsaVODEParser.Interval_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#interval_time}.
	 * @param ctx the parse tree
	 */
	void exitInterval_time(PLCtoIsaVODEParser.Interval_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void enterTime_unit(PLCtoIsaVODEParser.Time_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void exitTime_unit(PLCtoIsaVODEParser.Time_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#program_configuration}.
	 * @param ctx the parse tree
	 */
	void enterProgram_configuration(PLCtoIsaVODEParser.Program_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#program_configuration}.
	 * @param ctx the parse tree
	 */
	void exitProgram_configuration(PLCtoIsaVODEParser.Program_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#var_block}.
	 * @param ctx the parse tree
	 */
	void enterVar_block(PLCtoIsaVODEParser.Var_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#var_block}.
	 * @param ctx the parse tree
	 */
	void exitVar_block(PLCtoIsaVODEParser.Var_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterType_rule(PLCtoIsaVODEParser.Type_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitType_rule(PLCtoIsaVODEParser.Type_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PLCtoIsaVODEParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PLCtoIsaVODEParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#program_block_body}.
	 * @param ctx the parse tree
	 */
	void enterProgram_block_body(PLCtoIsaVODEParser.Program_block_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#program_block_body}.
	 * @param ctx the parse tree
	 */
	void exitProgram_block_body(PLCtoIsaVODEParser.Program_block_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(PLCtoIsaVODEParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(PLCtoIsaVODEParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLCtoIsaVODEParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLCtoIsaVODEParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PLCtoIsaVODEParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PLCtoIsaVODEParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#if_then_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_statement(PLCtoIsaVODEParser.If_then_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#if_then_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_statement(PLCtoIsaVODEParser.If_then_else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PLCtoIsaVODEParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PLCtoIsaVODEParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLCtoIsaVODEParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLCtoIsaVODEParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#equ_operator}.
	 * @param ctx the parse tree
	 */
	void enterEqu_operator(PLCtoIsaVODEParser.Equ_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#equ_operator}.
	 * @param ctx the parse tree
	 */
	void exitEqu_operator(PLCtoIsaVODEParser.Equ_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(PLCtoIsaVODEParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(PLCtoIsaVODEParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operator(PLCtoIsaVODEParser.Add_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operator(PLCtoIsaVODEParser.Add_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_operator(PLCtoIsaVODEParser.Multiply_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_operator(PLCtoIsaVODEParser.Multiply_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(PLCtoIsaVODEParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(PLCtoIsaVODEParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(PLCtoIsaVODEParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(PLCtoIsaVODEParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PLCtoIsaVODEParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PLCtoIsaVODEParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(PLCtoIsaVODEParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(PLCtoIsaVODEParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(PLCtoIsaVODEParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(PLCtoIsaVODEParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCtoIsaVODEParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(PLCtoIsaVODEParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCtoIsaVODEParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(PLCtoIsaVODEParser.Integer_literalContext ctx);
}