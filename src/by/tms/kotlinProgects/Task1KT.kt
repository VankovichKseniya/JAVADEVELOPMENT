package by.tms.kotlinProgects

import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Path

class Task1KT {

    private val lettersForRus: Array<Char> = arrayOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',  //создаю константу массива char
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')

    fun getSumChars(fileName: String) {
        var result = Files.readString(Path.of(fileName.toString()))        //создаю переменную String, которая построчно проходится по указанному файлу
        val writer = FileWriter("newFile.txt", true)    //создаю файл, в который буду записывать данные.
        for (char in 'а'..'я') {                                        //первый цикл, который проходится по всем буквам в константе
            lettersForRus[char - 'а'] = char
        }
        var count = 0                                                //задаю переменную int, которая будет сохранять в себе количество букв.
        var letter: Char                                            //задаю переменную char, которая будет сохранять в себе букву.
        var i = 0

        while (i < lettersForRus.size) {                               //создаю второй цикл, который проходиться по всем буквам константы.
            var w = 0
            while (w < result.length) {                                //создаю третий цикл, который проходится по всей длине каждой строчки файла,
                letter = result.toLowerCase()[w]                      //подгоняю все считываемые с файла символы в нижний регистр.
                if (letter.equals(lettersForRus[i])) {                   //сравниваю переменную char с массивом константы,
                    count++                                           //при значении true засчитывается еденица в переменную count
                }
                w++
            }                                                          // часть второго цикла,где в новый файл
            writer.append(lettersForRus[i] + " - " + count)            //записываются данные о количестве каждой буквы с новой строчки.
            writer.append('\n')
            count = 0                                                  //обнуляю count, чтобы данные с 3-го цикла не суммировались
            i++
        }
        writer.close()                                              //закрываю созданный файл после работы
    }
}