package epam.learn.module1.branching;

public class Task3 {

    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;
        double x3 = 3;
        double y3 = 3;

        if ((x3 - x2) * (y1 - y2) == (y3 - y2) * (x1 - x2)) {
            System.out.println("The points lie on one straight line");
        } else {
            System.out.println("The points don't lie on one straight line");
        }
    }
}
