package by.tms.lesson6;

public final class Task3ClassException extends Exception {            //Создаю собственный класс-исключение - наследник класса Exception.

    Task3ClassException(String s) throws Exception {              //Создаю метод, выбрасывающий исключение Exception.
        if (s == null) {
            throw new Exception();

        }
    }
}
