package by.tms.lesson2;

public class Task6 {
    public static void main(String[] args) {
        int baseNumber = 123;

        int therdNumberOfBase = baseNumber % 10;                    //выбираю последнюю цифру числа
        int secondNumberOfBase = (baseNumber / 10) % 10;            //выбираю вторую цифру числа
        int firstNumberOfBase = (baseNumber / 100) % 10;            //выбираю первую цифру числа

        System.out.println(therdNumberOfBase * secondNumberOfBase * firstNumberOfBase +" - произведение всех цифр заданного числа");
    }
}
