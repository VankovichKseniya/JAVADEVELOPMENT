package by.tms.lesson5.task1;

public class Numbers {

    public int digits1(int num) {

        int sum = 0;        //выставляю переменную, в которую буду записывать сумму чисел
        while (num > 0) // пока число больше нуля
        {
            sum += num % 10; // выделяю из него цифру и прибавляю к сумме цифр
            num /= 10; // сокращаю на одну цифру
        }
        return sum;
    }
}
