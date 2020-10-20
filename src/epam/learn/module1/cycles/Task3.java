package epam.learn.module1.cycles;

public class Task3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (++i <= 100) {
            sum += i * i;
        }

        System.out.println(sum);
    }
}
