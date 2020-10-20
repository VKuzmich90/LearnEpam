package epam.learn.module1.branching;

public class Task1 {

    public static void main(String[] args) {
        double a = 50;
        double b = 40;

        if (a + b < 180) {
            System.out.println("The triangle exists");
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("The triangle is rectangular");
            }
        }

    }
}
