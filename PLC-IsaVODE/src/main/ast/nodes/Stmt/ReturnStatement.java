package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class ReturnStatement extends Stmt {
    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    Expr expr;
    public ReturnStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
