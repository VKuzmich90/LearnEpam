package epam.learn.module2.onedemensionalArrays;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task9 {

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 7, 9, 0, 5, 7, 0, 1, 1, 1, 1};
        int[] popular = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popular[i]++;
                }
            }
        }

        int result = array[0];
        int popularElement = popular[0];

        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popularElement) {
                popularElement = popular[i];
                result = array[i];
            }

            if ((popularElement == popular[i]) && (array[i] < result)) {
                result = array[i];
            }
        }
        System.out.println(result);
    }
}
