package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class VariableDeclaration extends Node {
    ArrayList<String> names = new ArrayList<>();
    TypeRule typeRule;

    public VariableDeclaration() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public ArrayList<String> getNames() {
        return names;
    }

    public void addName(String name) {
        this.names.add(name);
    }

    public TypeRule getTypeRule() {
        return typeRule;
    }

    public void setTypeRule(TypeRule typeRule) {
        this.typeRule = typeRule;
    }
}
