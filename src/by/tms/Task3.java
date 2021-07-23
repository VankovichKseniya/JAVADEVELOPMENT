package by.tms;

public class Task3 {
    public static void main(String[] args) {
        int width = 25;                         //задаю параметры прямоугольника
        int length = 70;

        int perimeter = (width + length) * 2;             //считаю периметр и площадь
        int square = width * length;

        System.out.println("Периметр прямоугольника - " + perimeter);
        System.out.println("Площадь прямоугольника - " + square);
    }
}
