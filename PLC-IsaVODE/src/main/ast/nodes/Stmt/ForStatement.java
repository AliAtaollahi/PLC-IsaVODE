package main.ast.nodes.Stmt;

import main.ast.nodes.declaration.StatementList;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class ForStatement extends Stmt {
    Expr var, start, end, step;
    StatementList statementList = new StatementList();
    public ForStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expr getVar() {
        return var;
    }

    public void setVar(Expr var) {
        this.var = var;
    }

    public Expr getStart() {
        return start;
    }

    public void setStart(Expr start) {
        this.start = start;
    }

    public Expr getEnd() {
        return end;
    }

    public void setEnd(Expr end) {
        this.end = end;
    }

    public Expr getStep() {
        return step;
    }

    public void setStep(Expr step) {
        this.step = step;
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }
}
