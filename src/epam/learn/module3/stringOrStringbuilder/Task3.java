package epam.learn.module3.stringOrStringbuilder;

/* Проверить, является ли заданное слово палиндромом.
 */

public class Task3 {

    public static void main(String[] args) {
        String string = "Шалаш";

        System.out.println(isPalindrom(string));
    }

    private static boolean isPalindrom(String string) {
        boolean isPalindrom = true;

        for (int i = 0; i < string.length() / 2; i++) {
            String firstCh = String.valueOf(string.charAt(i));
            String lastCh = String.valueOf(string.charAt(string.length() - 1 - i));

            if (!firstCh.equalsIgnoreCase(lastCh)) {
                isPalindrom = false;
            }
        }

        return isPalindrom;
    }
}
