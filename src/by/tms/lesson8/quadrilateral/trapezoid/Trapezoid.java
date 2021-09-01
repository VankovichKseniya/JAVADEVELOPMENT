package by.tms.lesson8.quadrilateral.trapezoid;

import by.tms.lesson8.quadrilateral.Quadrilateral;

public class Trapezoid extends Quadrilateral {

    public Trapezoid(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public void SpecificForTrapezoid(){
        System.out.println("Трапеция - невыпуклая фигура");
    }

    @Override
    public String toString() {
        return "Trapezoid{}";
    }
}
