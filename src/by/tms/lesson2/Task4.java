package by.tms.lesson2;

public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        int c = 3;

        int b = i;                              //внедряю третьего лишнего, присваиваю ему значение первого
        i = c;
        System.out.println("i - " + i);
        i = b;
        c = i;
        System.out.println("c - " + c);
    }
}
