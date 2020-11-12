package epam.learn.module3.stringOrStringbuilder;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Task7 {

    public static void main(String[] args) {
        String string = "London is the capital of Great Britan";

        System.out.println(getNewString(string));
    }

    private static String getNewString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);

            if (ch == ' ') {
                stringBuilder.deleteCharAt(i--);

            }

            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (ch == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }

        return stringBuilder.toString();
    }
}
