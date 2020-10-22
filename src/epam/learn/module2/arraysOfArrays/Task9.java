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
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int columnMax = arraySum[0];
        int indexMax = 1;

        System.out.println();
        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + " ");
            if (columnMax < arraySum[i]) {
                columnMax = arraySum[i];
                indexMax = i + 1;
            }
        }
        System.out.println();
        System.out.print("Наибольшая сумма чисел в столбце: " + indexMax);
    }
}
