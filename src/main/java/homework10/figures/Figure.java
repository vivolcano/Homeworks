package homework10.figures;

public abstract class Figure {

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

    public Figure(double a, double x, double y, String name) {

        this.a = a;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public abstract double getPerimeter();

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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}