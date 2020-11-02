package epam.learn.module2.onedemensionalArrays;

import java.util.Arrays;

/* Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {

    public static void main(String[] args) {
        double[] array = {-5, 4, 7, -2, -8, 3, 0};
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }

            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }

        double changeElement = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = changeElement;

        System.out.println(Arrays.toString(array));
    }
}
