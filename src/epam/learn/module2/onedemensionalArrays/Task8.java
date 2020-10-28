package epam.learn.module2.onedemensionalArrays;

/*Дана последовательность целых чисел а1 ,а2 ,..., аn.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
 */
public class Task8 {

    public static void main(String[] args) {
        int[] array1 = {1, 0, -4, 2, -4, 7, 8, 0};
        int minElement = array1[0];
        int counter = 0;

        for (int i = 1; i < array1.length; i++) {
            if (minElement > array1[i]) {
                minElement = array1[i];
                counter = 0;
            }
            if (array1[i] == minElement) {
                counter++;
            }
        }
        int[] array2 = new int[array1.length - counter];
        int indexArray2 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != minElement) {
                array2[indexArray2] = array1[i];
                System.out.print(array2[indexArray2] + " ");
                indexArray2++;
            }
        }
    }
}
