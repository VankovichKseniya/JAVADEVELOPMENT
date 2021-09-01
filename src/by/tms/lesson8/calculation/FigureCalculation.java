package by.tms.lesson8.calculation;

import by.tms.lesson8.quadrilateral.parallelogram.Rectangle;
import by.tms.lesson8.triangle.Versatile;

public abstract class FigureCalculation {

    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private int radius;

    public FigureCalculation(int firstSide, int secondSide, int thirdSide, int radius) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.radius = radius;
    }

    public static int square(int firstSide, int secondSide, int thirdSide, int radius) {     //метод определяет, какая это фигура (если у фигуры нет третьей стороны, которая не равна предыдущим и радиуса -
        int square = 0;                                                                     //то это прямоугольник.
        if (thirdSide == 0 && radius == 0 && thirdSide != firstSide && thirdSide != secondSide) {//Исходя из этого считает площадь
            ShapeUtils.equilateral();
            square = Rectangle.squareOfRectangle(firstSide, secondSide);
        } else {
            ShapeUtils.triangle();
            square = Versatile.squareOfTriangle(firstSide, secondSide, thirdSide, radius);
        }
        return square;
    }

    public static void areaComparson(int firstFigureSquare, int secondFigureSquare) {          //сравнение двух полученных площадей
        if (firstFigureSquare == secondFigureSquare) {
            System.out.println("Площади фигур равны");
        } else {
            System.out.println("Площади фигур не равны");
        }
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
