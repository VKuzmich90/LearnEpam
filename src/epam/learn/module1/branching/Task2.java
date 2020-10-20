package epam.learn.module1.branching;


public class Task2 {

    public static void main(String[] args) {
        double a = 5.1;
        double b = 4;
        double c = 3;
        double d = -2;

        double minAB = a <= b ? a : b;
        double maxCD = c >= d ? c : d;
        double result = minAB >= maxCD ? minAB : maxCD;
        System.out.println(result);
    }
}
