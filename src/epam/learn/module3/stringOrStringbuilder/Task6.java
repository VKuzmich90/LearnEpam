package epam.learn.module3.stringOrStringbuilder;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {

    public static void main(String[] args) {
        String text = "London is the capital of Great Britan";

        System.out.println(getNewString(text));
    }

    private static String getNewString(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            stringBuilder.append(ch);
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }
}
