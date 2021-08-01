package by.tms.lesson4.task2;

import javax.naming.directory.Attributes;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        RomanNumbers checkNumber = new RomanNumbers();
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        x = x.trim().toUpperCase();
        System.out.println(checkNumber.RometoArab(x));
    }
}


