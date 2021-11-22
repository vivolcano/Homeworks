package homeworks.homework10;

import homeworks.homework10.figures.*;

public class Main {

    public static void main(String[] args) {

        Portable[] figures = new Portable[]{
                new Square(2, 3, 7, "square"),
                new Circle(4, 9, 6, "circle")
        };

        moveFigures(figures, 5, 5);
        showCoordinates(figures);
    }

    private static void showCoordinates(Portable[] figures) {
        for (Portable figure : figures) {
            System.out.println("Сurrent coordinates of " +
                    ((Figure) figure).getName() +
                    ": "  +
                    ((Figure) figure).getX() +
                    ", " +
                    ((Figure) figure).getY());
        }
    }

    public static void moveFigures(Portable[] figures, double newX, double newY) {

        for (Portable figure : figures) {
            figure.moveFigure(newX, newY);
        }
    }
}
