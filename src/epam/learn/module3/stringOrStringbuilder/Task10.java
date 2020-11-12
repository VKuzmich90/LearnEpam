package epam.learn.module3.stringOrStringbuilder;

/*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
вопросительным знаком. Определить количество предложений в строке X.
 */
public class Task10 {

    public static void main(String[] args) {
        String string = "Привет! Как дела? Как настроение? А я на карантине.";

        System.out.println(getCounter(string));
    }

    private static int getCounter(String string) {
        int counter = 0;
        char[] ch = {'!', '?', '.'};


        for (int i = 0; i < string.length(); i++) {
            char ch1 = string.charAt(i);

            for (char element : ch) {
                if (element == ch1 && (i == string.length() - 1 || string.charAt(i + 1) == ' ')) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
