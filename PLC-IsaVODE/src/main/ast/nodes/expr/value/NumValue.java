package main.ast.nodes.expr.value;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class NumValue extends Expr {
    String value;
    boolean isMinus = false;
    public NumValue()
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

    public boolean isMinus() {
        return isMinus;
    }

    public void setMinus(boolean minus) {
        isMinus = minus;
    }
}
