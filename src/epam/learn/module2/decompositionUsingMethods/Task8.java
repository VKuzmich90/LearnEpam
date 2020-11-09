package epam.learn.module2.decompositionUsingMethods;

import java.util.Arrays;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
 с номерами от k до m.
 */
public class Task8 {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));

        getSum3(array, 1, 3);
        getSum3(array, 3, 5);
        getSum3(array, 4, 6);
    }

    private static int getSum3(int[] array, int k, int m) {
        int sum = 0;
        if (k + 2 == m) {
            for (int i = k; i <= m; i++) {
                sum += array[i];
            }
            System.out.println("Сумма элементов массива с индексами от " + k + " до " + m + " равна: " + sum);
        } else {
            System.out.println("Введённые значения k и m некорректны");
        }
        return sum;
    }
}
