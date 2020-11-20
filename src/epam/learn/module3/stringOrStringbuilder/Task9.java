package epam.learn.module3.stringOrStringbuilder;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.
 */

public class Task9 {

    public static void main(String[] args) {
        String text = "London is the capital of Great Britan";

        System.out.println(counterElement(text, 'A', 'Z'));
    }

    private static int counterElement(String text, char a, char b) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= a && ch <= b) {
                counter++;
            }
        }

        return counter;
    }


}
