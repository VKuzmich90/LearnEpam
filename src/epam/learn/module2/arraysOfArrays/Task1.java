package epam.learn.module2.arraysOfArrays;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {

    public static void main(String[] args) {
        int[][] array = {{37, 41, 25}, {14, 15, 16,}, {27, 28, 19}};

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i += + 2) {
            System.out.println();
            for (int j = 0; j < array.length ; j++) {
                if (((j + 1) % 2 != 0) && array[0][j] > array[array.length-1][j] ) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
