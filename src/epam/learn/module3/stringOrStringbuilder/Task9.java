package epam.learn.module3.stringOrStringbuilder;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.
 */

public class Task9 {

    public static void main(String[] args) {
        String string = "London is the capital of Great Britan";

        System.out.println("Строчных букв:" + counterSmallCh(string));
        System.out.println("Прописных букв:" + counterBigCh(string));
    }

    private static int counterSmallCh(String string) {
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                counter++;
            }
        }

        return counter;
    }

    private static int counterBigCh(String string) {
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                counter++;
            }
        }

        return counter;
    }
}
