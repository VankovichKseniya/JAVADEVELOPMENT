package by.tms.lesson8.triangle;

import by.tms.lesson8.calculation.FigureCalculation;

public class Triangle extends FigureCalculation {
    public Triangle(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public static void specificForTriangle(){
        System.out.println("Треугольник имеет три стороны");
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }
}
