package epam.learn.module3.stringOrStringbuilder;

/* Проверить, является ли заданное слово палиндромом.
 */

public class Task3 {

    public static void main(String[] args) {
        String text = "Шалаш";

        System.out.println(isPalindrom(text));
    }

    private static boolean isPalindrom(String text) {
        text = text.toLowerCase();
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char firstCh = text.charAt(i);
            char lastCh = text.charAt(text.length() - 1 - i);

            if (firstCh != lastCh) {
                return false;
            }
        }

        return true;
    }
}
