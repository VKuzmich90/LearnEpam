package epam.learn.module1.cycles;

public class Task3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i * i;
            i++;
        }

        System.out.println(sum);
    }
}
