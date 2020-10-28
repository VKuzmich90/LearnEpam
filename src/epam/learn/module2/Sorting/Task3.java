package epam.learn.module2.Sorting;

import java.util.Arrays;

//Реализуйте сортировку обменами.
public class Task3 {

    public static void main(String[] args) {
        int[] array = {35, 7, 8, 13, 1, 9, 5};
        System.out.println(Arrays.toString(array));
        int copy;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    copy = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = copy;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
