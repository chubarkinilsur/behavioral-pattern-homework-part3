package visitor;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(),
                new Circle(),
                new Triangle()};

        var areaVisitor = new AreaVisitor();
        var perimetrVisitor = new PerimetrVisitor();
        var drawVisitor = new DrawVisitor();
        var analog3dVisitor = new Analog3dVisitor();
        for (Figure figure : figures) {
            figure.accept(areaVisitor);
            figure.accept(perimetrVisitor);
            figure.accept(drawVisitor);
            figure.accept(analog3dVisitor);

        }

    }
}
