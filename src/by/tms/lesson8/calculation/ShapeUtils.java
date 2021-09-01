package by.tms.lesson8.calculation;

public final class ShapeUtils extends FigureCalculation {

    public ShapeUtils(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public static void triangle() {
        System.out.println("Это треугольник");
    }

    public static void equilateral() {
        System.out.println("Это прямоугольник");
    }

    @Override
    public String toString() {
        return "ShapeUtils{}";
    }
}
