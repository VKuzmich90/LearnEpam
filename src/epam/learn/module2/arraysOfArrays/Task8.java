package epam.learn.module2.arraysOfArrays;

import java.util.Scanner;

/*В числовой матрице поменять местами два столбца любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры
 */
public class Task8 {

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

        System.out.println();
        System.out.print("Какие столбцы поменять местами? ");
        int column1 = scanner.nextInt();
        if (column1 < 0 || column1 > n) {
            System.out.println("Такого столбца нет");
        }

        int column2 = scanner.nextInt();
        if (column2 < 0 || column1 > n) {
            System.out.println("Такого столбца нет");
        }

        int changeElement = 0;
        for (int i = 0; i < array.length; i++) {
            changeElement = array[i][column1 - 1];
            array[i][column1 - 1] = array[i][column2 - 1];
            array[i][column2 - 1] = changeElement;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }
}
