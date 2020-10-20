package epam.learn.module2.onedemensionalArrays;

/* Даны целые числа а1 ,а2 ,..., аn .
Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {

    public static void main(String[] args) {
        int[] array = {1, 0, 5, 4, 2, 3, 7, 2, 1, 5};

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
