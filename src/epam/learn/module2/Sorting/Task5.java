package epam.learn.module2.Sorting;

import java.util.Arrays;

//Реализовать сортировку Шелла
public class Task5 {

    public static void main(String[] args) {
        int[] array = {35, 7, 8, 13, 1, 9, 5};
        System.out.println(Arrays.toString(array));
        int copy;
        int gap = array.length / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int i = right - gap; i >= 0; i -= gap) {
                    if (array[i] > array[i + gap]) {
                        copy = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = copy;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
    }
}

