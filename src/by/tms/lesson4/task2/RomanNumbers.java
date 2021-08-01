package by.tms.lesson4.task2;

class RomanNumbers {

    static String[] Rome = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
            "IX", "V", "IV", "I" };
    static int[] Arab = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    public int RometoArab(String rome) {

            StringBuffer romeNumber = new StringBuffer(rome);
        int arabNumber = 0, i = 0;                                          // Проверяю переданную строку на наличие символов
            if (romeNumber.length() > 0) {
                while (true) {
                    do {
                        if (Rome[i].length() <= romeNumber.length()) {          // Выделяю из строки подстроку и сравниваю со
                            if (Rome[i].equals(romeNumber.substring(0,          // значением из массива Arab
                                    Rome[i].length()))) {                          // После чего прибавляю число соответствующее
                                arabNumber += Arab[i];                               // индексу элемента римской цифры из массива Arab
                               romeNumber.delete(0, Rome[i].length());              // и удаляю из строки римскую цифру
                                if (romeNumber.length() == 0)
                                    return arabNumber;
                            } else
                                break;
                        } else
                            break;
                    } while (true && romeNumber.length() != 0);
                    i++;
                }
            }
            return 0;
        }
    }