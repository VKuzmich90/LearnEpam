package epam.learn.module2.decompositionUsingMethods;

import java.util.Scanner;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {

    public static void main(String[] args) {
        int number1 = 72;
        int number2 = 48;
        int number3 = 24;
        int number4 = 36;

        int nod = nod2(nod2(number1, number2), nod2(number3, number4));
        System.out.println("НОД четырёх чисел: " + nod);
    }

    private static int nod2(int number1, int number2) {
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
