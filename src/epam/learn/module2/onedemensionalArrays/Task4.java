package epam.learn.module2.onedemensionalArrays;

/* Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {

    public static void main(String[] args) {
        double[] array = {-5, 4, 7, -2, -8, 3, 0};
        int minIndex = 0;
        int maxIndex = 0;
        double minElement = array[0];
        double maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
                minIndex = i;
            }

            if (maxElement < array[i]) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        double changeElement = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = changeElement;

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
