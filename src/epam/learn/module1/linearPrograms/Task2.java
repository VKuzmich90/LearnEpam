package epam.learn.module1.linearPrograms;

public class Task2 {

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3.5;

        if ((b * b + 4 * a * c) > 0 && a != 0 && b != 0) {
            double result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c - 1 / (b * b);
            System.out.println(result);
        } else {
            System.out.println("The entered values are incorrect");
        }
    }
}
