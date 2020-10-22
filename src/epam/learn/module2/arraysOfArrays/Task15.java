package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {

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
        int maxElement = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 100);
                if (maxElement < array[i][j]) {
                    maxElement = array[i][j];
                }
            }
        }
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 1) {
                    array[i][j] = maxElement;
                }
            }
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
