package epam.learn.module2.Sorting;

//Реализуйте сортировку вставками.

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {35, 7, 8, 13, 1, 9, 5};
        System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {
            int element = array[left];
            int j = left;

            while (j > 0 && array[j - 1] > element) {
                array[j] = array[j - 1];
                j--;
                array[j] = element;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
