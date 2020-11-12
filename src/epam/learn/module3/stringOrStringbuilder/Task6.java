package epam.learn.module3.stringOrStringbuilder;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {

    public static void main(String[] args) {
        String string = "London is the capital of Great Britan";

        System.out.println(getNewString(string));
    }

    private static String getNewString(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(string.charAt(i));
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }
}
