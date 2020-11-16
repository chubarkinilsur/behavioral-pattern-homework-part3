package visitor;

public class Circle extends Figure {

    public Circle() {
        super("Circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
