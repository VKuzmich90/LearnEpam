package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
public class Task14 {

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

        int[] counter = new int[n];

        if (n <= m) {
            int[][] array = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (counter[j] < j + 1) {
                        array[i][j] = (int) (Math.random() * 2);
                    }
                    if (array[i][j] == 1) {
                        counter[j]++;
                    }
                    if (counter[j] + m - i - 1 <= j) {
                        array[i][j] = 1;
                    }
                }
            }
            printArray(array);

        } else {
            System.out.println("Введено некорректное значение. Число столбцов не должно превышать число строк");
        }
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
