package epam.learn.module3.stringOrStringbuilder;
/*
С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task4 {

    public static void main(String[] args) {
        String string = "информатика";

        System.out.println(getNewWord(string));
    }

    private static String getNewWord(String string) {
        String newWord = String.valueOf(string.charAt(string.indexOf('т')));
        newWord += String.valueOf(string.charAt(string.indexOf('о')));
        newWord += String.valueOf(string.charAt(string.indexOf('р')));
        newWord += String.valueOf(string.charAt(string.indexOf('т')));

        return newWord;
    }
}
