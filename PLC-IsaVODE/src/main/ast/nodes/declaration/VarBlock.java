package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class VarBlock extends Node {
    String varType;
    ArrayList<VariableDeclaration> variableDeclarations = new ArrayList<>();
    public VarBlock() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public ArrayList<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void addVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclarations.add(variableDeclaration);
    }
}
