package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {

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

        int copy;
        for (int i = 0; i < m; i++) {
            for (int k = n - 1; k >= 1; k--) {
                for (int j = 0; j < k; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        copy = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = copy;
                    }
                }
            }
        }
        printArray(array);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                copy = array[i][j];
                array[i][j] = array[i][n - 1 - j];
                array[i][n - 1 - j] = copy;
            }
        }
        printArray(array);
    }

    public static void printArray(int[][] array){
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }


}




