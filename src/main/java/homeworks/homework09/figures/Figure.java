package homeworks.homework09.figures;

public class Figure {

    private double a, b;
    private double x, y;
    private String name;

    public Figure(double a, double b, double x, double y, String name) {

        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Figure(double a, int x, int y, String name) {

        this.a = a;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }
}