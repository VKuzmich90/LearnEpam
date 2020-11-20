package epam.learn.module3.arrayOfCharacters;

/*Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {

    public static void main(String[] args) {
        String text = "Today I learned a new word. Tomorrow I will learn five more new words";

        System.out.println(text);
        System.out.println(String.join("", changeWord(text)));
    }

    private static String[] changeWord(String text) {
        String[] newText = new String[text.length() + counter(text)];
        int i = 0;
        int j = 0;

        while (i < text.length()) {

            if (i + 3 < text.length() && text.charAt(i) == 'w' && text.charAt(i + 1) == 'o'
                    && text.charAt(i + 2) == 'r' && text.charAt(i + 3) == 'd') {
                newText[j++] = "l";
                newText[j++] = "e";
                newText[j++] = "t";
                newText[j++] = "t";
                newText[j++] = "e";
                newText[j++] = "r";
                i += 3;
            } else {
                newText[j++] = String.valueOf(text.charAt(i));
            }
            i++;
        }
        return newText;
    }

    private static int counter(String text) {
        int result = 0;
        char[] ch = text.toCharArray();

        for (int i = 0; i < ch.length - 3; i++) {
            if (ch[i] == 'w' && ch[i + 1] == 'o' && ch[i + 2] == 'r' && ch[i + 3] == 'd') {
                result += 2;
            }
        }

        return result;
    }
}
