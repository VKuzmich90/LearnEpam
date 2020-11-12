package epam.learn.module3.stringOrStringbuilder;
/*
В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2 {

    public static void main(String[] args) {
        String string = "London is the capital of Great Britan";

        System.out.println(getNewString(string));
    }

    private static String getNewString(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                stringBuilder.append("ab");
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
 }
