package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class FunctionBlock extends Node {
    public FunctionBlock() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
