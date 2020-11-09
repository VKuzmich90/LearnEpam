package epam.learn.module2.decompositionUsingMethods;

import java.util.ArrayList;

/*
Найти все натуральные n-значные числа, цифры в которых образуют
строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию
 */

//Задача исправлена для все строго возрастающих чисел.
public class Task15 {

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = getNumbers(n);

        System.out.println(list.toString());
    }

    private static ArrayList<Integer> getNumbers(int n) {
        int firstNumber = 0;
        int lastNumber = 0;
        int difference1 = 0;
        int difference2 = 0;

        for (int i = 1; i <= n; i++) {
            firstNumber += (int) Math.pow(10, n - i) * i;
            lastNumber += (int) Math.pow(10, i) - Math.pow(10, i - 1) * i;
            difference1 += (int) Math.pow(10, i - 1) * i;
            difference2 += (int) Math.pow(10, n - i);
        }

        int step = difference2;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (isNeedNumber(i, n)) {
                list.add(i);

                if (i + difference1 % Math.pow(10, n - 1) == 0) {
                    i = firstNumber + difference2;
                    difference2 += step;
                }
            }
        }

        return list;
    }

    private static boolean isNeedNumber(int number, int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = number % 10;
            number /= 10;

            if (i >= 1) {   // После того как нашли две цифры сравниваем на соответствие условию.
                if (array[i] < array[i - 1]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
