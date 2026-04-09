package main.ast.nodes.Stmt;

import main.ast.nodes.declaration.StatementList;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class WhileStatement extends Stmt {
    Expr expr;
    StatementList statementList;
    public WhileStatement() {}

    public WhileStatement(Expr expr, StatementList statementList) {
        this.expr = expr;
        this.statementList = statementList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
