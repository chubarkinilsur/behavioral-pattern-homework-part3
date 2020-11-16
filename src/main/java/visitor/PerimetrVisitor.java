package visitor;

public class PerimetrVisitor extends Visitor {

    public PerimetrVisitor() {
        super("Watering");
    }

    @Override
    public void visit(Rectangle figure) {
        System.out.println("P=(a+b)*2");
    }

    @Override
    public void visit(Triangle figure) {
        System.out.println("P=a+b+c");
    }

    @Override
    public void visit(Circle figure) {
        System.out.println("P=2*pi*R");
    }
}
