package main.ast.nodes.Stmt;

import main.ast.nodes.declaration.StatementList;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class IfThenElseStatement extends Stmt {
    ArrayList<Pair<Expr, StatementList>> ifThenElseList = new ArrayList<>();
    StatementList elseStatementList;
    public IfThenElseStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public ArrayList<Pair<Expr, StatementList>> getIfThenElseList() {
        return ifThenElseList;
    }

    public void addIfThenElse(Expr expr, StatementList statementList) {
        ifThenElseList.add(new Pair<>(expr, statementList));
    }

    public StatementList getElseStatementList() {
        return elseStatementList;
    }

    public void setElseStatementList(StatementList elseStatementList) {
        this.elseStatementList = elseStatementList;
    }
}
