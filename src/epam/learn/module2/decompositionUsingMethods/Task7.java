package epam.learn.module2.decompositionUsingMethods;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {

    public static void main(String[] args) {
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        getSum(array);
    }

    private static long getSum(int[] array){
        long sum = 0;
        long factorial = 1;
        for (int i = 0; i < array.length ; i += 2) {
            for (int j = 1; j <= array[i] ; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println(sum);
        return sum;
    }

}
