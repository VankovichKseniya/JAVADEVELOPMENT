package by.tms.lesson6;

import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.util.Random;

public final class Tasks {

    private Tasks() {
    }

    public static void task1() {                    //Объявляю переменную со значением null. Вызываю метод у этой переменной
        Integer iAmNull = null;
        int i = iAmNull;
    }

    public static void task2() {                    //Создаю цикл for c минусовым значением для массива, который вызывает ArrayIndexOutOfBoundsException.

        int[] array = new int[5];
        for (int i = -6; i < 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void task5() throws ClassCastException, CharacterCodingException, IOException {   //Создаю метод случайным образом выбрасывающий одно из 3-х видов исключений
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 0) {
            throw new NullPointerException();
        }
        if (randomNumber == 1) {
            throw new CharacterCodingException();
        }
        if (randomNumber == 2) {
            throw new IOException();
        }
    }


    public static boolean random() {                       // 50%-ную вероятность можно сделать с помощью рандомного true/false метода
        return new Random().nextBoolean();
    }

    public static void task6() throws Exception {     //Создаю метод, который в 50% случаев бросает исключение.
        try {
            if (!random()) {
                System.out.println("Повезло");
            }
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("finally");
        }
    }
}


