package epam.learn.module2.decompositionUsingMethods;

import java.util.Arrays;

/* Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

//Заменил переменную secondMaxIndex на secondNumber
public class Task5 {

    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        System.out.println(secondMax(array));

    }
    private static int secondMax(int[] array) {
        int maxIndex = 0;
        int secondNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                secondNumber = array[maxIndex];
                maxIndex = i;
            }
        }
        for (int i = maxIndex + 1; i < array.length; i++) {
            if (secondNumber < array [i]) {
                secondNumber = array[i];
            }
        }
        return secondNumber;
    }
}
