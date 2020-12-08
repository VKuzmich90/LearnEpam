package epam.learn.module4.aggregationAndComposition.Task1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */
public class Main {

    public static void main(String[] args) {

        Word heading = new Word("Новости");

        Word word1 = new Word("Всем ");
        Word word2 = new Word("привет! ");

        Sentence sentence0 = new Sentence(word1);

        sentence0.addWord(word2);

        String line1 = "Светлана Тихановская заявила о встрече с Джо Байденом," +
                " 46-м избранным президентом США. Со стороны Белого дома анонсов пока не было.\n";

        Sentence sentence1 = new Sentence(line1);

        String line2 = "Штаб Светланы Тихановской подал первое заявление на расследование преступления" +
                " силовиков. Оно связано с  насилием над предпринимателем Максимом Хорошиным." +
                " Его задержали во дворе дома в Минске и сильно избили. После этого Максим уехал в Литву." +
                " Уже собраны результаты медэкспертизы, которая установила телесные повреждения\n";

        String line3 = "Студента Яна Солоновича осудили суммарно на 71 сутки. Этот срок получился из" +
                " решений пяти судов, которые прошли меньше, чем за месяц. Его задержали 1 ноября во" +
                " время марша в Куропаты, он все ещё не вышел. Ян — студент-четверокурсник БГУИР и" +
                " экс-сотрудник научно-технического центра КГБ (уволиться ему предложили в день задержания\n";

        Text news = new Text(heading, sentence0);

        news.addSentence(new Sentence(line1));
        news.addSentence(new Sentence(line2));
        news.addSentence(new Sentence(line3));

        news.printHeading();
        news.printText();


    }
}