package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        double[][] array = new double[n][n];
        int counter = 0;
        if (n <= 0) {
            System.out.println("Введённое значение некорректно");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = Math.sin((i * i - j * j) / n);
                    if (array[i][j] > 0) {
                        counter++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%.3f" + " ", array[i][j]));
            }
            System.out.println();
        }
        System.out.println(counter);
    }
}
