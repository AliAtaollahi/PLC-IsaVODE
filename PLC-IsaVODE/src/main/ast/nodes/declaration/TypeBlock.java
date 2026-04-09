package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class TypeBlock extends Node {
    public TypeBlock() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
