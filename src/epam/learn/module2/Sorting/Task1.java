package epam.learn.module2.Sorting;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.
 */
public class Task1 {

    public static void main(String[] args) {
        int k = 3;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {11, 12, 13, 14};
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < result.length; i++) {
            if (i <= k) {
                result[i] = array1[i];
            } else if (i == k + 1) {
                for (int j = 0; j < array2.length; j++) {
                    result[i + j] = array2[j];
                }
            } else {
                for (int j = i - 1; j < result.length - array2.length; j++) {
                    result[j + array2.length] = array1[j];
                }
            }
            System.out.print(result[i] + " ");
        }
    }
}
