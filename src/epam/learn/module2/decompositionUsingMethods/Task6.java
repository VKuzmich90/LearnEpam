package epam.learn.module2.decompositionUsingMethods;

/* Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {

    public static void main(String[] args) {
        int number1 = 9;
        int number2 = 6;
        int number3 = 8;

        System.out.println(isPrimeNumbers(number1, number2, number3));
    }

    private static boolean isPrimeNumbers(int number1, int number2, int number3) {
        return ( nod(nod(number1, number2), nod(number2, number3)) == 1);
    }

    private static int nod(int number1, int number2) {
        int copy;
        while (number1 != number2) {
            if (number1 > number2) {
                copy = number1;
                number1 = number2;
                number2 = copy;
            }
            number2 = number2 - number1;
        }
        return number1;

    }
}




