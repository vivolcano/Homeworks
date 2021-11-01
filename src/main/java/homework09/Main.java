package homework09;

import homework09.figures.*;

public class Main {

    public static void main(String[] args) {

        printPerimeter((new Rectangle(4, 6, 5, 6, "rectangle")));
        printPerimeter((new Square(5, 3,3, "square")));
        printPerimeter((new Ellipse(5, 3, 7, 4, "ellipse")));
        printPerimeter((new Circle(7, 5, 2, "circle")));
    }

    public static void printPerimeter(Figure figure) {

        String roundingPerimeter = String.format("%.2f", figure.getPerimeter());
        System.out.println("Perimeter of " + figure.getName() + " = " + roundingPerimeter);
    }
}
