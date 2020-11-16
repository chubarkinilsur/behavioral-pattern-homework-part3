package visitor;

public abstract class Visitor {

    private String operationName;

    protected Visitor(String operationName) {
        this.operationName = operationName;
    }

    public abstract void visit(Rectangle figure);

    public abstract void visit(Triangle figure);

    public abstract void visit(Circle figure);

    public String getOperationName() {
        return operationName;
    }
}
