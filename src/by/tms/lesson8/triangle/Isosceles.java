package by.tms.lesson8.triangle;

public class Isosceles extends Triangle {
    public Isosceles(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public static void specificForIsosceles(){
        System.out.println("2 стороны треугольника равны");
    }

    @Override
    public String toString() {
        return "Isosceles{}";
    }
}
