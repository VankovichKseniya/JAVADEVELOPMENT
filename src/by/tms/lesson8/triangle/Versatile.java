package by.tms.lesson8.triangle;

public class Versatile extends Triangle {
    public Versatile(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public static int squareOfTriangle(int firstSide, int secondSide, int thirdSide, int radius){
        double triangleSquare = ((firstSide * secondSide) * thirdSide) / (4 * radius);       //формула площади разностороннего треугольника
        System.out.print("Площадь треугольника = ");
        return (int) Math.round(triangleSquare);
    }

    @Override
    public String toString() {
        return "Versatile{}";
    }
}
