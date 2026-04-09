package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class ConfigurationBlock extends Node {
    public ConfigurationBlock() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
