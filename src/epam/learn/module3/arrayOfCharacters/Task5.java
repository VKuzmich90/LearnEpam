package epam.learn.module3.arrayOfCharacters;

/*Удалить в строке все лишние пробелы,
то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task5 {

    public static void main(String[] args) {
        String string = "  Аня,      8 лет,  2Б       класс, школa    №137    ";
        System.out.println(String.join("", removeSpaces(string)));
    }

    private static String[] removeSpaces(String string) {
        String newString = string.trim();
        String[] resultString = new String[getLength(string)];

        int i = 0;
        int j = 0;

        while (i < newString.length()) {

            if (newString.charAt(i) != ' ') {
                resultString[j++] = String.valueOf(newString.charAt(i++));
            } else if (newString.charAt(i + 1) != ' ') {
                resultString[j++] = String.valueOf(newString.charAt(i++));
            } else {
                i++;
            }

        }
        return resultString;
    }

    //Считаем нужную длину итоговой строки
    private static int getLength(String string) {
        String newString = string.trim();
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) != ' ') {
                counter1++;
            } else if (newString.charAt(i + 1) != ' ') {
                counter2++;
            }
        }
        return counter1 + counter2;
    }
}
