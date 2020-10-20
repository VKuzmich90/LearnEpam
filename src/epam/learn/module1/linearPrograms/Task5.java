package epam.learn.module1.linearPrograms;

public class Task5 {

    public static void main(String[] args) {
        int allSeconds = 86399;

        int hours = allSeconds / 3600;
        int minutes = allSeconds % 3600 / 60;
        int seconds = allSeconds % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");
    }
}
