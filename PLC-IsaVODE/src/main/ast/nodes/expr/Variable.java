package main.ast.nodes.expr;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class Variable extends Expr {
    String name;
    public Variable() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
