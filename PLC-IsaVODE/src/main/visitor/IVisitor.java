package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.Stmt.AssignmentStatement;
import main.ast.nodes.Stmt.IfThenElseStatement;
import main.ast.nodes.Stmt.Stmt;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.BinaryExpr;
import main.ast.nodes.expr.UnaryExpr;
import main.ast.nodes.expr.value.BoolValue;
import main.ast.nodes.expr.value.NumValue;
import main.ast.nodes.expr.Variable;


public interface IVisitor<T> {

    T visit(Program program);
    T visit(ProgramBlockBody programBlockBody);
    T visit(VarBlock varBlock);

    T visit(AssignmentStatement assignmentStatement);

    T visit(IfThenElseStatement ifThenElseStatement);

    T visit(StatementList statementList);

    T visit(TypeRule typeRule);

    T visit(Variable variable);

    T visit(VariableDeclaration variableDeclaration);

    T visit(BinaryExpr binaryExpr);

    T visit(UnaryExpr unaryExpr);

    T visit(BoolValue boolValue);

    T visit(NumValue numValue);
    T visit(Stmt stmt);
}
