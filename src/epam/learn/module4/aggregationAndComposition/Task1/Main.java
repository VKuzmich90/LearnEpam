package epam.learn.module4.aggregationAndComposition.Task1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */
public class Main {

    public static void main(String[] args) {

        Word heading = new Word("Заголовок");

        Word word1 = new Word("Всем");
        Word word2 = new Word("привет!");

        Sentence sentence0 = new Sentence(word1);
        sentence0.addWord(word2);

        Text text = new Text(heading, sentence0);

        Word word3 = new Word("Что");
        Word word4 = new Word("нового?");

        Sentence sentence1 = new Sentence(word3);
        sentence1.addWord(word4);

        text.addSentence(sentence1);
        text.printHeading();
        text.printText();


    }
}
