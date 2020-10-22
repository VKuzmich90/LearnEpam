package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число строк: ");
        int m = scanner.nextInt();
        System.out.print("Введите число число столбцов: ");
        int n = scanner.nextInt();

        int[][] array = new int[m][n];
        System.out.println("Введите массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Какую строку вывести? ");
        int k = scanner.nextInt();
        if (k < 0 || k > m) {
            System.out.print("Введённое значение строки некорректно");
        }
        System.out.print("Какой столбец вывести? ");
        int p = scanner.nextInt();
        if (p < 0 || p > n) {
            System.out.print("Введённое значение некорректно");
        }

        for (int i = 0; i < array.length; i++) {
            if (i == k - 1) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }

            for (int j = 0; j < array[i].length; j++) {
                if (j == p - 1) {
                    System.out.println();
                    System.out.print(array[i][j]);
                }
            }
        }
    }


}




