package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        if (n < 0 || n % 2 != 0) {
            System.out.println("Введённое значение некорректно");
        } else {
            int[][] array = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                   if (i + 1 <= n / 2) {
                       array[i][j] = (j >= i) && (j < n - i) ? 1 : 0;
                   } else {
                       array[i][j] = (j <= i) && (j + 1 >= n - i) ? 1 : 0;
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
