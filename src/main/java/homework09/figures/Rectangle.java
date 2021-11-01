package homework09.figures;

public class Rectangle extends Figure {

    public Rectangle(double a, double b, double x, double y, String name) {

        super(a, b, x, y, name);
    }

    @Override
    public double getPerimeter() {

        return 2 * (getA() + getB());
    }
}
