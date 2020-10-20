package epam.learn.module2.arraysOfArrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

    public static void main(String[] args) {
    int[][] array = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
