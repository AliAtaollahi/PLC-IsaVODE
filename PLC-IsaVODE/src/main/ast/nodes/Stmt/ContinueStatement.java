package main.ast.nodes.Stmt;

import main.visitor.IVisitor;

public class ContinueStatement extends Stmt {
    public ContinueStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
