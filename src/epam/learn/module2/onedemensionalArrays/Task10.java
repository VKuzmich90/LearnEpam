package epam.learn.module2.onedemensionalArrays;

/*Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 */
public class Task10 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0) {
                array[i - 1] = 0;
            }
        }


        for (int i = 1; i < (array.length + 1) / 2 ; i++) {
            array[i] = array[2 * i];
            array[2 * i] = 0;
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
