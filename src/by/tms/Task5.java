package by.tms;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));                                     //создаю сканер
        int i = scanner.nextInt();


        if (i % 10 == 1 && i % 100 != 11 && i != 11) {                                         //выбираю числа, которые заканчиваются на цифру 1, исключаю 11
            System.out.print(i + " рубль");
    } else if (i % 10 > 4 || i % 100 > 11 && i % 100 < 20 || i % 10 == 0 || i % 100 == 11) {  //выбираю числа, которые заканчиваются числами от 5 до 9, числа с нулём на конце,
            System.out.print(i + " рублей");                                                    //добавляю варианты, которые заканчиваются на цифры от 12 до 19.
        } else System.out.print(i + " рубля");                                                  //Для слово "рубля" ничего расписывать не надо, такие цифры итак дойдут до этой строки
    }
}
