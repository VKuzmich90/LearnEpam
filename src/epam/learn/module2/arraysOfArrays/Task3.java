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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
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

        for (int j = 0; j < array[n].length; j++) {
            System.out.print(array[k-1][j] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][p-1]);
        }

    }
}







