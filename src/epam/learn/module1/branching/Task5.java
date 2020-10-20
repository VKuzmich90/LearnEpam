package epam.learn.module1.branching;

public class Task5 {

    public static void main(String[] args) {
        double x = 4;
        double result;

        if ((x * x * x + 6) != 0) {
            result = x <= 3? x * x - 3 * x + 9 : 1 / (x * x * x + 6);
            System.out.println(result);
        } else {
            System.out.println("The entered values are incorrect");
        }
    }
}
