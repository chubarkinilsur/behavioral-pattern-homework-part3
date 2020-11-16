package visitor;

public class DrawVisitor extends Visitor {

    public DrawVisitor() {
        super("Draw");
    }

    @Override
    public void visit(Rectangle figure) {
        System.out.println("нарисовать прямоугольник");
    }

    @Override
    public void visit(Triangle figure) {
        System.out.println("нарисовать треугольник");
    }

    @Override
    public void visit(Circle figure) {
        System.out.println("нарисовать круг");
    }
}