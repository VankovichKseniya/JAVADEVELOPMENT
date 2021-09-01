package by.tms.lesson8.quadrilateral.parallelogram;

public class Rectangle  extends Parallelogram{
    public Rectangle(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public static int squareOfRectangle(int firstSide, int secondSide){
        int quadrilateralSquare = firstSide * secondSide;               //площадь прямоугольника
        System.out.print("Площадь прямоугольника = ");
        return quadrilateralSquare;
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
