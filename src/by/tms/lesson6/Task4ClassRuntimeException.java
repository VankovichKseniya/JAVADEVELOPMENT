package by.tms.lesson6;

public final class Task4ClassRuntimeExeption extends RuntimeException{          //Создаю собственный класс-исключение - наследник класса RuntimeException
    private Task4ClassRuntimeExeption(String s){
        if (s == null) {
            throw new RuntimeException("Exception: s is null!");                //Добавляю в конструктор своего класса возможность указания сообщения
        }
    }
}
