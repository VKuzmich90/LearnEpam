package epam.learn.module4.aggregationAndComposition.Task1;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.
 */

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words = new ArrayList<>();

    public Sentence(Word word) {
        this.words.add(word);
    }


    public void addWord(Word word) {
        this.words.add(word);
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "" + words;
    }
}
