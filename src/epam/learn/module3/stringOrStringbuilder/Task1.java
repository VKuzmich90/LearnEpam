package epam.learn.module3.stringOrStringbuilder;

/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task1 {

    public static void main(String[] args) {
        String string = "  Аня,      8 лет,  2Б       класс, школa    №137    ";

        System.out.println(getMaxSpaces(string));
    }

    private static int getMaxSpaces(String string) {
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCounter < counter) {
                    maxCounter = counter;
                }
                counter = 0;
            }
        }
        return maxCounter;
    }
}
