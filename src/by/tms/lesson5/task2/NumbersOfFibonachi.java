package by.tms.lesson5.task2;

public final class NumbersOfFibonachi {

    public static int NumberOfFibonachiinCicle(int number) {
        int firstNumber = 1;                                        //задаю первые 2 числа
        int secondNumber = 1;
        int thirdNumber;
        System.out.print(firstNumber + " " + secondNumber + " ");           //вывожу в консоль
        thirdNumber = firstNumber + secondNumber;                           //инициализирую третий инт для дальнейшей работы с while
        while (thirdNumber < number) {                                      // *попытки сделать условие, при котором числа Фибоначчи будут выводится в консоль ДО введенного числа * - не работает
            if (firstNumber + secondNumber >= number) {                       //выставляю условия ПЕРЕД работой с числами, чтобы в нужный момент остановить цикл
                break;
            }
            thirdNumber = firstNumber + secondNumber;                   //пишу формулу Фибоначчи
            System.out.print(thirdNumber + " ");
            firstNumber = secondNumber;                                 //присваиваю числам другие значения
            secondNumber = thirdNumber;
        }
        return number;
    }
}

//    public static void NumberOfFibonachiInRecursion(int number){
//        int firstNumber = 1;                                        //задаю первые 2 числа
//        int secondNumber = 1;
//        int thirdNumber;
//        System.out.print(firstNumber + " " + secondNumber + " ");           //вывожу в консоль
//        thirdNumber = firstNumber + secondNumber;                           //инициализирую третий инт для дальнейшей работы с while
//            if(firstNumber + secondNumber != number && firstNumber + secondNumber > number){
//                NumberOfFibonachiInRecursion(firstNumber + secondNumber);                  //пишу формулу Фибоначчи
//                System.out.print(thirdNumber + " ");
//                firstNumber = secondNumber;                                 //присваиваю числам другие значения
//                secondNumber = thirdNumber;                                 //выставляю условия ПЕРЕД работой с числами, чтобы в нужный момент остановить цикл
//                return;
//            }
//
//
//    }
//    public static long recursive(int n) {
//        if (n <= 1) {
//            return n;
//        }
//
//        return recursive(n - 2) + recursive(n - 1);
//    }
//}