package main.visitor;

import main.ast.nodes.declaration.Program;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.BinaryExpr;
import main.ast.nodes.expr.UnaryExpr;
import main.ast.nodes.expr.value.BoolValue;
import main.ast.nodes.expr.value.NumValue;
import main.ast.nodes.expr.Variable;

/*GOALs:
 *   1. print out scope changes each time a new scope starts
 *   2. print the identifier if it is initialized
 *   3. print the identifier if it is used
 *   4. print out the name of the function when it is defined
 *   5. print out the name of the function when it is used
 *
 * */

public abstract class Visitor<T> implements IVisitor<T> {
    @Override
    public T visit(Program program) {
        return null;
    }
    @Override
    public T visit(ProgramBlockBody programBlockBody) {
        return null;
    }
    @Override
    public T visit(VarBlock varBlock) {
        return null;
    }
    @Override
    public T visit(AssignmentStatement assignmentStatement) {
        return null;
    }
    @Override
    public T visit(IfThenElseStatement ifThenElseStatement) {
        return null;
    }
    @Override
    public T visit(StatementList statementList) {
        return null;
    }
    @Override
    public T visit(TypeRule typeRule) {
        return null;
    }
    @Override
    public T visit(Variable variable) {
        return null;
    }
    @Override
    public T visit(VariableDeclaration variableDeclaration) {
        return null;
    }
    @Override
    public T visit(BinaryExpr binaryExpr) {
        return null;
    }

    @Override
    public T visit(UnaryExpr unaryExpr) {
        return null;
    }
    @Override
    public T visit(BoolValue boolValue) {
        return null;
    }
    @Override
    public T visit(NumValue numValue) {
        return null;
    }
    @Override
    public T visit(Stmt stmt) {
        return null;
    }
    @Override
    public T visit(ForStatement forStatement) {
        return null;
    }
    @Override
    public T visit(WhileStatement whileStatement) {
        return null;
    }
    @Override
    public T visit(SourceUnit sourceUnit) {
        return null;
    }
}
