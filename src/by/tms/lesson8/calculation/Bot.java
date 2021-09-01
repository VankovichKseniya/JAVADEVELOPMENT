package by.tms.lesson8.calculation;
import java.util.Scanner;

public class Bot {                                                                  //класс Bot сохраняет в себе все методы со сканером
                                                                                    //для получения всех данных о фигуре
    public  int acceptFirstSideFromConsole(){
        System.out.println("Введите длину одной стороны фигуры:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public  int acceptSecondSideFromConsole(){
        System.out.println("Введите длину второй стороны фигуры:");
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextInt();
    }
    public  int acceptThirdSideFromConsole(){                                   //допустим, мы не знаем что у нас за фигура на входе, но мы знаем, сколько у нее НЕ одинаковых сторон
        System.out.println("Введите длину третьей стороны фигуры(если у фигуры 3 стороны)" + "\n" + "ЛИБО введите \"0\" для следующего шага:");
        Scanner scanner2 = new Scanner(System.in);
        return scanner2.nextInt();
    }
    public  int acceptFourthSideFromConsole(){
        System.out.println("Введите длину радиуса описанной окружности фигуры(если у фигуры 3 стороны)" + "\n" + "ЛИБО введите \"0\" для следующего шага:");
        Scanner scanner3 = new Scanner(System.in);
        return scanner3.nextInt();
    }
}
