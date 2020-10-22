package epam.learn.module2.arraysOfArrays;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
public class Task11 {

    public static void main(String[] args) {
        int[][] array = new int[10][20];
        int[] arrayCounter = new int[10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = (int) (Math.random() * 16);
                System.out.printf("%5d", array[i][j]);
                if (array[i][j] == 5) {
                    arrayCounter[i]++;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < arrayCounter.length; i++) {
            if (arrayCounter[i] >= 3) {
                System.out.println("Номер cтроки: " + i + 1 + ", количество пятёрок: " + arrayCounter[i]);
            }
        }
    }
}
