package epam.learn.module4.aggregationAndComposition.Task1;

import java.util.ArrayList;

/**Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.
 */
public class Text {

    private Word heading;

    private ArrayList<Sentence> content;


    public Text(Word heading, Sentence sentence){
        this.heading = heading;
        this.content = new ArrayList<>();
        this.content.add(sentence);
    }

    public void addSentence (Sentence sentence) {
        this.content.add(sentence);
    }

    public void printText() {
        for (Sentence sentence : this.content) {
            System.out.print(sentence);
        }
    }

    public void printHeading() {
        System.out.println(heading);
    }

    public void setHeading(Word heading) {
        this.heading = heading;
    }

    public Word getHeading() {
        return this.heading;
    }
}
