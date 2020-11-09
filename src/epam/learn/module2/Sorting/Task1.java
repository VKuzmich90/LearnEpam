package epam.learn.module2.Sorting;

import java.util.Arrays;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.
 */
public class Task1 {

    public static void main(String[] args) {
        int k = 3;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {11, 12, 13, 14};
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i <= k; i++) {
            result[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            result[k + 1 + j] = array2[j];
        }

        for (int j = k + 1; j < result.length - array2.length; j++) {
            result[j + array2.length] = array1[j];
        }

        System.out.print(Arrays.toString(result));
    }
}

