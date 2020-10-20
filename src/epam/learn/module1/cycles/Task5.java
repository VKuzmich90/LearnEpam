package epam.learn.module1.cycles;

public class Task5 {

    public static void main(String[] args) {
        int i = 0;

        while (i < 256) {
            System.out.println(i + " " + (char) i);
            i++;
        }
    }
}
