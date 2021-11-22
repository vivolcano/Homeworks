package homeworks.homework10.figures;

public class Ellipse extends Figure {

    public Ellipse(double radius1, double radius2, double x, double y, String name) {

        super(radius1, radius2, x, y, name);
    }

    @Override
    public double getPerimeter() {

        return 4 * ((Math.PI * getA() * getB()) + Math.pow((getA() - getB()), 2)) / (getA() + getB());
    }
}
