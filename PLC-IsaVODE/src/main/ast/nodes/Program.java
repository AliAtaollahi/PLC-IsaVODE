package main.ast.nodes;

import main.ast.nodes.declaration.ProgramBlockBody;
import main.ast.nodes.declaration.VarBlock;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Program extends Node{
    String name;
    ArrayList<VarBlock> varBlocks = new ArrayList<>();
    ProgramBlockBody programBlockBody;
    public Program() {}

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

    public ArrayList<VarBlock> getVarBlocks() {
        return varBlocks;
    }

    public void addVarBlock(VarBlock varBlock) {
        this.varBlocks.add(varBlock);
    }

    public ProgramBlockBody getProgramBlockBody() {
        return programBlockBody;
    }

    public void setProgramBlockBody(ProgramBlockBody programBlockBody) {
        this.programBlockBody = programBlockBody;
    }
}
