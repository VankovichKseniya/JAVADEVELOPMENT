package by.tms.lesson4.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                           //создаю сканер,
        String x = scanner.nextLine();                                      //задаю ему значение строки

        Polindrome checking = new Polindrome();
        System.out.println(checking.isPalindrome(x));
    }
}
