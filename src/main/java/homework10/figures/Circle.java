package homework10.figures;

public class Circle extends Ellipse implements Portable {

    public Circle(double radius, double x, double y, String name) {

        super(radius, radius, x, y, name);
    }

    @Override
    public double getPerimeter() {

        return 2 * getA() * Math.PI;
    }

    @Override
    public void moveFigure(double newX, double newY) {

        setX(newX);
        setY(newY);
    }
}
