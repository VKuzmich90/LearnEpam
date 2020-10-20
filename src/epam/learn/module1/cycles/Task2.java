package epam.learn.module1.cycles;

public class Task2 {

    public static void main(String[] args) {
        double a = -5;
        double b = 5;
        double h = 1;
        double x = 3;

        for (double i = a; i <= b; i += h) {
            if (i <= 2) {
                System.out.println("Point: " + i + ", value: " + -x);
            } else {
                System.out.println("Point: " + i + ", value: " + x);
            }
        }
    }
}

