package by.tms.lesson4.task1;

public class Polindrome {

    public Polindrome() {
    }

    boolean isPalindrome(String word) {
        word = word.trim().toUpperCase();                                   //привожу введённое слово в один регистр
        int n = word.length();
        for (int i = 0; i < (n/2); ++i) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
