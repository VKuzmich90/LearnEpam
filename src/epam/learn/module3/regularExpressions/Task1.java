package epam.learn.module3.regularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;


/*Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать
слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
а в случае равенства – по алфавиту.
 */
public class Task1 {

    public static void main(String[] args) throws IOException {
        String text = "Один. Два весёлых чижа. Три банки - апельсинов. Четыре чумазых чертёнка?\n" +
                "Семь... Это второе предложение.\n" +
                "Пластмасовый мир победил! Макет оказался сильней.\n" +
                "Что делать? Где жить? Когда умирать? Зачем я здесь? Почему он не уходит? \n" +
                "Последний абзац. Ооооо моя оборона! Долой президента! Конец!";

        getTextOperation(text);
    }


    private static void getTextOperation(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String conditions = "- введите \"1\" для сортировки абзацев по количеству предложений; \n" +
                "- введите \"2\" для сортировки в каждом предложении слов по длине;\n" +
                "- введите \"3\" для сортировки лексЕм в предложениях по убыванию количества \n" +
                "  вхождений заданного символа, а в случае равенства - по алфавиту.\n" +
                "Для завершения работы приложения введите \"exit\"\n";
        String choice = "";
        System.out.println(conditions);

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Введите команду: ");

            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortParagraphs(text);
                    break;
                case "2":
                    sortWords(text);
                    break;
                case "3":
                    sortLexemes(text);
                    break;
                case "exit":
                    System.out.println("\nЗавершение работы.");
                    break;
                default:
                    System.out.println("Неверная команда. Повторите ввод команды снова.\n");
            }
        }
    }

    private static void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxCounterSentences = 0;

        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;

            if (maxCounterSentences < sentences.length) {
                maxCounterSentences = sentences.length;
            }
        }

        //вывод от самого короткого абзаца до самого длинного
        for (int i = 1; i <= maxCounterSentences; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    private static void sortWords(String text) {
        String[] paragraphs = text.split("\n");

        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);

            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                //сортировка слов
                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {

                        if (words[j].length() > words[j + 1].length()) {
                            String change = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = change;
                        }
                    }
                }

                //вывод слов
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void sortLexemes(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите символ для сортировки лексем по убыванию: ");

        String letter = reader.readLine();
        String[] paragraphs = text.split("\n");

        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);

            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                //сортировка лексем
                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {

                        int countRight = 0;
                        int countLeft = 0;

                        for (int k = 0; k < words[j].length(); k++) { //считаем количество вхождений
                            if (String.valueOf(words[j].charAt(k)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[j + 1].length(); n++) {   //считаем количество вхождений в следующем слове
                            if (String.valueOf(words[j + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {   //сравниваем количесво вхождений
                            String change = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = change;
                        } else if (countLeft == countRight) { //если количество вхождений равно, сортировка по алфавиту

                            String[] forCompare = {words[j], words[j + 1]};
                            Arrays.sort(forCompare);
                            words[j] = forCompare[0];
                            words[j + 1] = forCompare[1];
                        }
                    }
                }

                //вывод слов
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:|-)\\s*");
        return pattern.split(sentence);
    }
}
