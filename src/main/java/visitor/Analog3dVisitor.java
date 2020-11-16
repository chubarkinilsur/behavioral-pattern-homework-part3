package visitor;

public class Analog3dVisitor extends Visitor {
    public Analog3dVisitor() {
        super("3d");
    }

    @Override
    public void visit(Rectangle figure) {
        System.out.println("3d паралелепипед");
    }

    @Override
    public void visit(Triangle figure) {
        System.out.println("3d ирамида");
    }

    @Override
    public void visit(Circle figure) {
        System.out.println("3d шар");
    }
}
