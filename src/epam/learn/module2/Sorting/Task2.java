package epam.learn.module2.Sorting;

import java.util.Arrays;

//Реализуйте сортировку выбором.
public class Task2 {

    public static void main(String[] args) {
        int[] array = {35, 7, 8, 13, 1, 9, 5};
        System.out.println(Arrays.toString(array));
        int change;

        for (int left = 0; left < array.length; left++) {
            int minIndex = left;
            for (int i = left; i < array.length; i++) {
                if (array[minIndex] > array[i]) {
                    minIndex = i;
                }
            }
            change = array[left];
            array[left] = array[minIndex];
            array[minIndex] = change;
        }
        System.out.println(Arrays.toString(array));
    }
}
