package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число строк: ");
        int m = scanner.nextInt();
        if (m < 0) {
            System.out.println("Введено некорретное значение");
        }
        System.out.print("Введите число столбцов: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Введено некорретное значение");
        }

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        printArray(array);
        sortArray(array, n, true);
        printArray(array);
        sortArray(array, n, false);
        printArray(array);
    }

    private static void printArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    private static void sortArray(int[][] array, int n, boolean up) {
        int copy;
        for (int j = 0; j < n; j++) {
            for (int k = array.length - 1; k >= 1; k--) {
                for (int i = 0; i < k; i++) {
                    if (up == true) {
                        if (array[i][j] > array[i + 1][j]) {
                            copy = array[i][j];
                            array[i][j] = array[i + 1][j];
                            array[i + 1][j] = copy;
                        }
                    } else if (array[i][j] < array[i + 1][j]) {
                        copy = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = copy;
                    }
                }
            }
        }
    }
}
