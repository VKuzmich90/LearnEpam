package epam.learn.module2.decompositionUsingMethods;

import java.util.ArrayList;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
public class Task13 {

    public static void main(String[] args) {
        int n = 101;

        printTwins(n);
    }

    private static void printTwins(int n) {
        ArrayList<Integer> list = getArray(n);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == 2) {
                System.out.println(list.get(i - 1) + " " + list.get(i));
            }
        }
    }

    private static ArrayList<Integer> getArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = n;

        if (!isPrime(n)) {
            i = n + 1;
        }

        for (; i <= 2 * n; i += 2) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }


    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }

        double root = Math.sqrt(number);
        for (int i = 3; i <= root; i += +2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

