package epam.learn.module2.decompositionUsingMethods;

import java.util.Scanner;

/*Написать метод(методы) для нахождения наибольшего общего делителя и
наименьшего общего кратного двух натуральных чисел:
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        if (number1 < 0) {
            System.out.println("Введено некорректное значние!");
        }
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        if (number2 < 0) {
            System.out.println("Введено некорректное значние!");
        }

        System.out.println("НОД: " + nod(number1, number2));
        System.out.println("НОК: " + nok(number1, number2));
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

    public static int nok(int number1, int number2) {
        return number1 * number2 / nod(number1, number2);
    }
}
