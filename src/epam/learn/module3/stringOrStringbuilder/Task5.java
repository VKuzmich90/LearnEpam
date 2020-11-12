package epam.learn.module3.stringOrStringbuilder;

/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task5 {

    public static void main(String[] args) {
        String string = "London is the capital of Great Britan";

        System.out.println(getCounter(string));
    }

    private static int getCounter(String string) {
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                counter++;
            }
        }

        return counter;
    }
}
