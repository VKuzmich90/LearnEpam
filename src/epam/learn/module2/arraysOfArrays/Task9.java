package epam.learn.module2.arraysOfArrays;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */
public class Task9 {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int[] arraySum = new int[10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                arraySum[j] += array[i][j];
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }

        int columnMax = 0;
        System.out.println();
        for (int i = 0; i < arraySum.length; i++) {
            System.out.printf("%5d", arraySum[i]);
            if (arraySum[columnMax] < arraySum[i]) {
                columnMax = i;
            }
        }
        System.out.println();
        System.out.print("Наибольшая сумма чисел в столбце: " + (columnMax + 1));
    }
}
