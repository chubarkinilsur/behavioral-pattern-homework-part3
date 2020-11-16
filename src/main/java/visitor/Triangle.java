package visitor;

public class Triangle extends Figure {

    public Triangle() {
        super("Triangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
