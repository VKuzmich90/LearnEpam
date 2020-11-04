package epam.learn.module2.decompositionUsingMethods;

/* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
 */
public class Task16 {

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Сумма: " + getSum(n));
        getEvenNumerals(n);
    }

    private static long getSum(int n) {
        long sum = 0;

        for (int i = (int) Math.pow(10, n - 1) + 1; i < Math.pow(10, n); i += 2) {
                if (i / (int) Math.pow(10, n - 1) % 2 == 1) { //сократили поле перебора
                    if (isNeedNumber(i, n)) {
                        sum += i;
                    }
                }
        }
        return sum;
    }

    private static int getEvenNumerals(int n) {
        long sum = getSum(n);
        int counter = 0;

        while (sum > 0) {
            if (sum % 10 % 2 == 0) {
                counter++;
            }
            sum /= 10;
        }
        System.out.println("В сумме чётных чисел: " + counter);
        return counter;
    }

    private static boolean isNeedNumber(int number, int n) {
        for (int i = 0; i < n; i++) {
            if (number % 10 % 2 == 1) {
                number /= 10;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

