package epam.learn.module2.onedemensionalArrays;


/*Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class Task6 {

    public static void main(String[] args) {
        double[] array = {-7.1, 2.7, 5, 4, -3.5, 8, 9, 135, -0.4, 4, 10, -32, 19, 20}; //5 4 8 135 -32 20
        double sum = 0;

        /*  я принимал, что порядковые номера начинаются с нуля.
        Если принимать, что порядковые номера начинаются с еденицы, то в функцию надо добавить +1
         */
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
