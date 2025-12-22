package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class ProgramBlockBody extends Node {
    StatementList statementList;
    public ProgramBlockBody() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }
}
