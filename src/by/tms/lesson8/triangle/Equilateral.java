package by.tms.lesson8.triangle;

public class Equilateral extends Triangle {
    public Equilateral(int firstSide, int secondSide, int thirdSide, int radius) {
        super(firstSide, secondSide, thirdSide, radius);
    }

    public void specificForEquilateral(){
        System.out.println("Все углы по 60 градусов");
    }
}
