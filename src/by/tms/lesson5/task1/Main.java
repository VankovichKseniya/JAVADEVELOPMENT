package by.tms.lesson5.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Numbers newNumber = new Numbers();
        System.out.println("Сумма введенных чисел = " + newNumber.digits1(c));
    }
}
