package epam.learn.module2.decompositionUsingMethods;
/*Дано натуральное число N.
Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        int n = 375912087;

        System.out.println(Arrays.toString(getArray(n)));
    }

    private static int[] getArray(int n) {
        int counter = 0;
        int copy = n;

        while (copy > 0) {
            copy /= 10;
            counter++;
        }

        int[] array = new int[counter];

        for (int i = 0; i < array.length; i++) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }
}
