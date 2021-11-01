package homework09.figures;

public class Circle extends Ellipse {

    public Circle(double radius, double x, double y, String name) {
        super(radius, radius, x, y, name);
    }

    @Override
    public double getPerimeter() {
        return 2 * getA() * Math.PI;
    }
}
