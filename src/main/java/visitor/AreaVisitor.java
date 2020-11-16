package visitor;

public class AreaVisitor extends Visitor {

    public AreaVisitor() {
        super("Area");
    }

    @Override
    public void visit(Rectangle figure) {
        System.out.println("площадь прямоугольника равна ширина на длину");
    }

    @Override
    public void visit(Triangle figure) {
        System.out.println("площадь треугольника равна одна вторая высоты на основание");
    }

    @Override
    public void visit(Circle figure) {
        System.out.println("площадь круга равна пи р крадрат");
    }
}
