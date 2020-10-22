package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/* Построить магический квадрат
 */
public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону квадрата: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Введено некорретное значение");
        }

        int[][] array = new int[n][n];
        if (n >= 3 && n % 2 == 1) {
            oddArray(n, array);
        } else if (n % 4 == 0) {
            evenArray(n, array);
        } else {
            System.out.println("Такого магического квадрата программа не выведет");
        }
    }

    public static void evenArray(int n, int[][] array) {
        int[][] array1 = sortArray(n);
        int counter = 0;
        for (int i = 0; i < array1.length/2; i++) {
            int change;
            if (i < array1.length / 2) {
                change = array1[i][i];
                array1[i][i] = array1[array1.length - 1 - counter][array1.length - 1 - counter];
                array1[array1.length - 1 - counter][array1.length - 1 - counter] = change;
                counter++;
            }
        }
              counter = 0;
        for (int i = 0; i < array1.length / 2; i++) {
            int change;
            if(i < array1.length / 2){
                change = array1[array1.length - 1 - counter][i];
                array1[array1.length - 1 - counter][i] = array1[i][array1.length - 1 - counter];
                array1[i][array1.length - 1 - counter] = change;
                counter++;
            }
        }
        printArray(array1);
    }

    public static int[][] sortArray(int n) {
        int[][] array = new int[n][n];
        int number = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = number;
                number++;
            }
        }
        return array;
    }


    public static void oddArray(int n, int[][] array) {
        int i = 0;
        int j = (n - 1) / 2;
        array[i--][j++] = 1;
        for (int k = 2; k <= n * n; k++, j++, i--) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }

            if (i < 0) {
                i = n - 1;
            }

            if (j > n - 1) {
                j = 0;
            }

            if (array[i][j] != 0) {
                i += 2;
                j--;
            }
            array[i][j] = k;
        }
        printArray(array);
    }


    public static void printArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }
}
