package epam.learn.module4.aggregationAndComposition.Task1;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.
 */

import java.util.ArrayList;

public class Sentence {

    private String sentence;

    private ArrayList<Word> words;

    public Sentence(Word word) {
        this.words = new ArrayList<>();
        this.words.add(word);
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word word) {
        this.words.add(word);
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
