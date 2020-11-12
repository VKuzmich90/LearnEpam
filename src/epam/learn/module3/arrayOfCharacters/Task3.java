package epam.learn.module3.arrayOfCharacters;

/*В строке найти количество цифр.
 */
public class Task3 {
    public static void main(String[] args) {
        String string = "Аня, 8 лет, 2Б класс; Петя 17 лет, 11A класс";

        System.out.println(countNumerals(string));
    }

    private static int countNumerals(String string) {
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (isNumeral(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isNumeral(char ch) {
        char[] numerals = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean isNumeral = false;
        for (char element : numerals) {
            if (ch == element) {
                isNumeral = true;
            }
        }
        return isNumeral;
    }
}