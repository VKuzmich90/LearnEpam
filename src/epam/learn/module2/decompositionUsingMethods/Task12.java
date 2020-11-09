package epam.learn.module2.decompositionUsingMethods;

import java.util.ArrayList;

/*
Даны натуральные числа К и N.
Написать метод(методы) формирования массива А, элементами которого являются числа,
сумма цифр которых равна К и которые не большее N.
 */
// Увеличил шаг перебора
public class Task12 {

    public static void main(String[] args) {
        int k = 13;
        int n = 195;

        getArray(k, n);
    }

    private static ArrayList<Integer> getArray(int k, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int copy = 0;

        for (int i = 1; i < n; i++) {
            if (getSumOfNumerals(i) == k) {
                System.out.print(i + " ");
                i += 8;
                list.add(getSumOfNumerals(i));
            }
        }

        return list;
    }

    private static int getSumOfNumerals(int i) {
        int sum = 0;

        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }

        return sum;
    }
}
