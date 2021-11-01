package homework10.figures;

public class Square extends Rectangle implements Portable {

    public Square(double a, double x, double y, String name) {

        super(a, a, x, y, name);
    }

    @Override
    public void moveFigure(double newX, double newY) {
        setX(newX);
        setY(newY);
    }
}
