package epam.learn.module3.regularExpressions;

/*
 * Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *    <note id = "1">
 *       <to>Вася</to>
 *       <from>Света</from>
 *       <heading>Напоминание</heading>
 *       <body>Позвони мне завтра!</body>
 *    </note>
 *    <note id = "2">
 *        <to>Петя</to>
 *        <from>Маша</from>
 *        <heading>Важное напоминание</heading>
 *        <body/>
 *    </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 * xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 * тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {

        String text = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note><note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";

        System.out.println(getTag(text));
    }

    private static String getTag(String text) {
        StringBuilder strBuilder = new StringBuilder();

        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pContain = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String[] lines = text.split("\n\\s*"); // разбиваем текст на строки

        // проверяем содержимое каждой строки
        for (String line : lines) {
            for (String tag : splitToTags(line)) {
                Matcher mOpen = pOpen.matcher(tag);
                Matcher mClose = pClose.matcher(tag);
                Matcher mContain = pContain.matcher(tag);
                Matcher mEmpty = pEmpty.matcher(tag);

                if (mEmpty.find()) {
                    strBuilder.append(mEmpty.group());
                    strBuilder.append(" - тег без тела\n");
                }
                if (mOpen.find()) {
                    strBuilder.append(mOpen.group());
                    strBuilder.append(" - открывающий тег\n");
                }
                if (mContain.find()) {
                    strBuilder.append(mContain.group().substring(1));
                    strBuilder.append("\b - содержимое тега\n");
                }
                if (mClose.find()) {
                    strBuilder.append(mClose.group());
                    strBuilder.append(" - закрывающий тег\n");
                }
            }
        }
        return strBuilder.toString();
    }

    private static List<String> splitToTags(String s) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int index = s.indexOf("><", start);
        while (index != -1) {
            result.add(s.substring(start, index + 1));
            start = index + 1;
            index = s.indexOf("><", start);
        }
        result.add(s.substring(start));
        return result;
    }
}
