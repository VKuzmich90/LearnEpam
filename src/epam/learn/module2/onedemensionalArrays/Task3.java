package epam.learn.module2.onedemensionalArrays;

/*Дан массив действительных чисел, размерность которого N.
 Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {

    public static void main(String[] args) {
        double[] array = new double[21];
        int counterPlus = 0;
        int counterMinus = 0;
        int counterZero = 0;

        for (int i = 0; i < array.length ; i++) {
            array[i] = i - 10;
            if (array[i] < 0) {
                counterMinus++;
            } else if (array[i] > 0) {
                counterPlus++;
            } else {
                counterZero++;
            }
        }

        System.out.println("Negative numbers: " + counterMinus + ", Zero: " + counterZero +
                ", Positive numbers: " + counterPlus);
    }
}
