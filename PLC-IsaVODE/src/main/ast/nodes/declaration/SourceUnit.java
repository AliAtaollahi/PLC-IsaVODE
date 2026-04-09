package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class SourceUnit extends Node {
    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public ConfigurationBlock getConfigurationBlock() {
        return configurationBlock;
    }

    public void setConfigurationBlock(ConfigurationBlock configurationBlock) {
        this.configurationBlock = configurationBlock;
    }

    public ArrayList<FunctionBlock> getFunctionBlocks() {
        return functionBlocks;
    }

    public void addFunctionBlock(FunctionBlock functionBlock) {
        this.functionBlocks.add(functionBlock);
    }

    public ArrayList<TypeBlock> getTypeBlocks() {
        return typeBlocks;
    }

    public void addTypeBlock(TypeBlock typeBlock) {
        this.typeBlocks.add(typeBlock);
    }

    Program program;
    ConfigurationBlock configurationBlock;
    ArrayList<FunctionBlock> functionBlocks = new ArrayList<>();
    ArrayList<TypeBlock> typeBlocks = new ArrayList<>();
    public SourceUnit() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
