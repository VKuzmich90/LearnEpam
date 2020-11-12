package epam.learn.module3.stringOrStringbuilder;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(getMaxWord(line));
    }

    private static String getMaxWord(String string) {
        String maxWord = "";
        int maxLength = 0;
        boolean isMultiplyMaxWord = false;

        String[] arrayOfStrings = string.split(" ");

        for (int i = 0; i < arrayOfStrings.length; i++) {
            String currentWord = arrayOfStrings[i];

            if (maxLength < currentWord.length()) {
                maxLength = currentWord.length();
                maxWord = currentWord;
                isMultiplyMaxWord = false;
            } else if (maxLength == currentWord.length()) {
                isMultiplyMaxWord = true;
            }

            if (isMultiplyMaxWord) {
                throw new RuntimeException("More than one max word!");
            }
        }

        return maxWord;
    }
}


