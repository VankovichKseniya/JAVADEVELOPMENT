package by.tms.lesson8.quadrilateral;

import by.tms.lesson8.calculation.FigureCalculation;

public class Quadrilateral extends FigureCalculation {
    public Quadrilateral(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }
    public static void specificForQuadrilateral(){
        System.out.println("Четырёхугольник имеет 4 стороны на одной плоскости");
    }

    @Override
    public String toString() {
        return "Quadrilateral{}";
    }
}
