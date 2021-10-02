package by.tms.kotlinProgects

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import java.util.*

class Task2KT {
    fun fileWithRandomNumbers() {
        val fileForWrite = FileWriter("FileForWriting.txt", true)   //создаю новый файл
        val intForRandom = IntArray(20)                                        //задаю массив для случанйых чисел
        var i: Int = 0
        while (i < intForRandom.size) {
            val random: Int = (Math.random() * 100).toInt()                        //наполняю массив числами
            intForRandom[i] = random
            fileForWrite.write("" + intForRandom[i])                           //записываю в файл массив чисел
            fileForWrite.append("\n")
            i++
        }
        fileForWrite.close()                                                       //закрываю файл
    }

    fun inputRandomNumbers(inputFileName: String, outputFileName: String) {
        val reader = BufferedReader(FileReader(inputFileName))                     //генерирую баффер для чтения
        val writer = BufferedWriter(FileWriter(outputFileName))                    //генерирую баффер для записи( тут и создаю новый файл)
        val arrayForRandom = IntArray(20)                                     //создаю массив для количества чисел в файле
        var counter = 0                                                           //создаю счётчик для массива
        var inputString: String? = ""                                             //стока для прохода по файлу построчно
        while ((reader.readLine().also { inputString = it }) != null) {
            arrayForRandom[counter] = inputString?.toInt()!!                       //строку в виде инта записываю в массив
            counter++
        }

        Arrays.sort(arrayForRandom)                                               //сортирую массив классом Arrays
        for (stringForWrite: Int in arrayForRandom) {                             //прохожусь по массиву и записываю в файл каждую ячейку
            writer.write(stringForWrite.toString())
            writer.newLine()
        }
        writer.close()
        reader.close()
    }
}

