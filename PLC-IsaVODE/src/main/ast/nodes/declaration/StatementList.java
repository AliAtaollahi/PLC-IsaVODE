package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.Stmt.Stmt;
import main.visitor.IVisitor;

import java.beans.Statement;
import java.util.ArrayList;

public class StatementList extends Node {
    ArrayList<Stmt> statements = new ArrayList<>();
    public StatementList() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public ArrayList<Stmt> getStatements() {
        return statements;
    }

    public void addStatement(Stmt stmt) {
        this.statements.add(stmt);
    }
}
