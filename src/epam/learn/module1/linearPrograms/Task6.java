package epam.learn.module1.linearPrograms;

public class Task6 {

    public static void main(String[] args) {
        double x = 1;
        double y = 2;

        if (isInInterval(y, -3, 0) && isInInterval(x, -4, 4)
                || isInInterval(y, 0, 4) && isInInterval(x, -2, 2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isInInterval(double x, double point1, double point2) {
        if (x >= point1 && x <= point2) {
            return true;
        } else {
            return false;
        }
    }
}
