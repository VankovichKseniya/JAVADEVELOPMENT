package by.tms.lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {

    private static final char[] LETTERS_FOR_RUS = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',          //создаю константу массива char
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};                                           //алфавита

    public static void getSumChars(File fileName) {
        try {
            String result = Files.readString(Path.of(String.valueOf(fileName)));        //создаю переменную String, которая построчно проходится по указанному файлу
            FileWriter writer = new FileWriter("newFile.txt", true);    //создаю файл, в который буду записывать данные.
            for (char ch = 'а'; ch <= 'я'; ch++) {                                     //первый цикл, который проходится по всем буквам в константе
                LETTERS_FOR_RUS[ch - 'а'] = ch;
            }
            int count = 0;                                        //задаю переменную int, которая будет сохранять в себе количество букв.
            char letter;                                            //задаю переменную char, которая будет сохранять в себе букву.
            for (int i = 0; i < LETTERS_FOR_RUS.length - 1; i++) {      //создаю второй цикл, который проходиться по всем буквам константы.
                for (int w = 0; w < result.length(); w++) {             //создаю третий цикл, который проходится по всей длине каждой строчки файла,
                    letter = result.toLowerCase().charAt(w);               //подгоняю все считываемые с файла символы в нижний регистр.
                    if (letter == LETTERS_FOR_RUS[i]) {                     //сравниваю переменную char с массивом константы,
                        count++;                                            //при значении true засчитывается еденица в переменную count
                    }
                }
                try  {                                                                      // часть второго цикла,где в новый файл
                    writer.append(LETTERS_FOR_RUS[i] + " - " + count);                          //записываются данные о количестве каждой буквы с новой строчки.
                    writer.append('\n');
                    count = 0;                                                                  //обнуляю count, чтобы данные с 3-го цикла не суммировались
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.close();                                                             //закрываю созданный файл после работы
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
