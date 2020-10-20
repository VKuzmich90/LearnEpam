package epam.learn.module2.onedemensionalArrays;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Task2 {

    public static void main(String[] args) {
        double[] array = new double[10];
        double z = 4.9;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        System.out.println(counter);
    }
}