package epam.learn.module3.stringOrStringbuilder;

/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task1 {

    public static void main(String[] args) {
        String text = "  Аня,      8 лет,  2Б       класс, школa    №137                    ";

        System.out.println(getMaxSpaces(text));
    }

    private static int getMaxSpaces(String text) {
        int counter = 0;
        int maxCounter = 0;
        String newText = text + ".";

        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == ' ') {
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
