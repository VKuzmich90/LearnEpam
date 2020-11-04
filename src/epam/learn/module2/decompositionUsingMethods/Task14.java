package epam.learn.module2.decompositionUsingMethods;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.
 */
public class Task14 {

    public static void main(String[] args) {
        int k = 1000;

        printArmstongNumbers(k);
    }

    private static void printArmstongNumbers(int k) {
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isArmstrongNumber(int number) {
        int counter = getCounter(number);
        double sum = 0;
        int copy = number;
        for (int i = 0; i < counter; i++) {
            sum += Math.pow(copy % 10, counter);
            copy /= 10;
        }
        return sum == number;
    }

    private static int getCounter(int number) {
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
