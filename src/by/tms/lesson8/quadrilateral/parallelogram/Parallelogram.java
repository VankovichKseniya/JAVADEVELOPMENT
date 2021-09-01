package by.tms.lesson8.quadrilateral.parallelogram;

import by.tms.lesson8.quadrilateral.Quadrilateral;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public void specificForParallelogram(){
        System.out.println("Паралелограмм - выпуклая фигура");
    }

    @Override
    public String toString() {
        return "Parallelogram{}";
    }
}
