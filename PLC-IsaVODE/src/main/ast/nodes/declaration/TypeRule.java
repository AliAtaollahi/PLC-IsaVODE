package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class TypeRule extends Node {
    String name;
    public TypeRule() {}

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
