package by.tms.lesson5.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFromScanner = scanner.nextInt();
        System.out.println(NumbersOfFibonachi.NumberOfFibonachiinCicle(numberFromScanner));
    }
}
