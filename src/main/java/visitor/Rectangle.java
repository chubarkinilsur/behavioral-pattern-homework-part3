package visitor;


public class Rectangle extends Figure {

    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
