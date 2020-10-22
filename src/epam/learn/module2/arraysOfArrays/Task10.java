package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/*Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер стороны матрицы: ");
        int n = scanner.nextInt();
        if (n < 0 ) {
            System.out.println("Введено некорретное значение");
        }

        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (Math.random() * 100 - 50);
                System.out.printf("%.2f" + "    ", array[i][j] );
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print("[" + i + "]" + "[" + j + "]: ");
                    System.out.println(String.format("%.2f",  + array[i][j]));
                }
            }
        }
    }

}
