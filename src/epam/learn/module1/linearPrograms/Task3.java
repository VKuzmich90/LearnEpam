package epam.learn.module1.linearPrograms;

public class Task3 {

    public static void main(String[] args) {
        double x = 1;
        double y = 2;

        if ((Math.cos(x) - Math.sin(y)) != 0) {
            double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
            System.out.println(result);
        } else {
            System.out.println("The entered values are incorrect");
        }
    }
}
