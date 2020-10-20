package epam.learn.module1.cycles;

public class Task1 {

    public static void main(String[] args) {
        int number = 6;
        int sum = 0;

        if (number > 0) {
            for (int i = 1; i <= number ; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
