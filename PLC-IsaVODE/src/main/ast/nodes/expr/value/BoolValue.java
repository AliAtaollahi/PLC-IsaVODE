package main.ast.nodes.expr.value;

import main.ast.nodes.expr.Expr;
import main.ast.nodes.expr.operator.UnaryOperator;
import main.visitor.IVisitor;

public class BoolValue extends Expr {
    String value;
    public BoolValue()
    {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
