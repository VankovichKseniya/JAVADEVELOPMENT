package by.tms.lesson7;

import java.io.*;
import java.util.Arrays;

public class Task2 {

    public static void fileWithRandomNumbers() {

        FileWriter fileForWrite = null;
        try {
            fileForWrite = new FileWriter("FileForWriting.txt", true);  //создаю новый файл
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] intForRandom = new int[20];                                               //задаю массив для случанйых чисел
        for (int i = 0; i < intForRandom.length; i++) {
            int random = (int) (Math.random() * 100);                                   //наполняю массив числами
            intForRandom[i] = random;
            try {
                if (fileForWrite != null) {
                    fileForWrite.write("" + intForRandom[i]);                        //записываю в файл массив чисел
                    fileForWrite.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if (fileForWrite != null) {
                fileForWrite.close();                                                        //закрываю файл
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void InputRandomNumbers(String inputFileName, String outputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));     //генерирую баффер для чтения
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {  //генерирую баффер для записи( тут и создаю новый файл)
            int[] arrayForRandom = new int[20];                                             //создаю массив для количества чисел в файле
            int counter = 0;                                                                //создаю счётчик для массива
            String inputString = "";                                                        //стока для прохода по файлу построчно
            while ((inputString = reader.readLine()) != null) {
                arrayForRandom[counter] = Integer.parseInt(inputString);                    //строку в виде инта записываю в массив
                counter++;
            }
            Arrays.sort(arrayForRandom);                                                    //сортирую массив классом Arrays
            for (int stringForWrite : arrayForRandom) {                                     //прохожусь по массиву и записываю в файл каждую ячейку
                writer.write(String.valueOf(stringForWrite));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


