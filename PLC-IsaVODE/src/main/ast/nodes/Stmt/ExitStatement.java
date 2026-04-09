package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.ast.nodes.expr.Variable;
import main.visitor.IVisitor;

public class ExitStatement extends Stmt {
    public ExitStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
