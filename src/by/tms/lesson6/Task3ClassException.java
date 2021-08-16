package by.tms.lesson6;

public final class Task3ClassExeption extends Exception{            //Создаю собственный класс-исключение - наследник класса Exception.

    Task3ClassExeption(String s) throws Exception{              //Создаю метод, выбрасывающий исключение Exception.
        if (s == null) {
            throw new Exception();
        }
    }
}
