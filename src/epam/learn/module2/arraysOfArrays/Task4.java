package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        if (n < 0 || n % 2 != 0) {
            System.out.println("Введённое значение некорректно");
        } else {
            int[][] array = new int[n][n];

            for (int i = 0; i < n; i++) {
                if ((i + 1) % 2 == 1) {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = j + 1;
                    }
                } else {
                    for (int j = 0 ; j < n; j++) {
                        array[i][j] = n - j;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}