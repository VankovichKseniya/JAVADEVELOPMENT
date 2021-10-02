package by.tms.kotlinProgects

import java.io.File
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Path

class task1 {

    val LETTERS_FOR_RUS: Array<Char> = arrayOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',  //создаю константу массива char
    'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')

    fun getSumChars(fileName: File){
        var result = Files.readString(Path.of(fileName.toString()))
        val writer = FileWriter("newFile.txt", true)

        for(char in 'а'..'я'){
            LETTERS_FOR_RUS[char - 'а'] = char
        }
        var count = 0
        var letter: Char

        var i = 0
        var w = 0
        while (i < LETTERS_FOR_RUS.size){
            i++
            while(w < result.length){
                letter = result.toLowerCase()[w]
                if(letter.equals(LETTERS_FOR_RUS[i])){
                    count++
                }
                w++
            }
            writer.append(LETTERS_FOR_RUS[i] + " - " + count)
            writer.append('\n')
            count = 0
        }
           writer.close()
    }
}