package epam.learn.module1.linearPrograms;

public class Task4 {

    public static void main(String[] args) {
        double number = 123.456;

        double result = number % 1 * 1000 + (number - number % 1) / 1000;
        System.out.println(String.format("%.3f", result));
    }
}
