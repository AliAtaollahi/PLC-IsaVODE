package main.ast.nodes.Stmt;

import main.ast.nodes.Node;
import main.ast.nodes.expr.Variable;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class AssignmentStatement extends Stmt {
    Variable variable;
    Expr expr;
    public AssignmentStatement() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
