package by.tms.lesson6;

public final class Task4ClassRuntimeException extends RuntimeException {          //Создаю собственный класс-исключение - наследник класса RuntimeException
    private Task4ClassRuntimeException(String s) {
        if (s == null) {
            throw new RuntimeException("Exception: s is null!");                //Добавляю в конструктор своего класса возможность указания сообщения
        }
    }
}
