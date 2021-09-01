package by.tms.lesson8.quadrilateral.parallelogram;

public class Rhombus extends Parallelogram {


    public Rhombus(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void SpecificForRhombus(){
        System.out.println("Все 4 стороны равны");
    }
}
