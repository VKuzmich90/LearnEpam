package epam.learn.module3.arrayOfCharacters;

/*Удалить в строке все лишние пробелы,
то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task5 {

    public static void main(String[] args) {
        String string = "  Аня,      8 лет,  2Б       класс, школa    №137    ";

        System.out.println(removeSpaces(string));
    }

    private static String removeSpaces(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String newString = string.trim();

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == ' ') {
                if (newString.charAt(i + 1) != ' ') {
                    stringBuilder.append(' ');
                }
            } else {
                stringBuilder.append(newString.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
