package by.tms.lesson3;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0,10);
        Point p2 = new Point(10,16);
        System.out.println("Растояние между точками координат - " + p1.distance(p2));
        Rectangle calculate = new Rectangle(p1, p2);

        calculate.calculateTheSquareOfARectangle();
        calculate.calculatePerimeterOfTheRectangle();
        calculate.calculateDiagonalLength();
    }
}
