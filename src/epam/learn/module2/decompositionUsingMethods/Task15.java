package epam.learn.module2.decompositionUsingMethods;

import java.sql.SQLOutput;

/*
Найти все натуральные n-значные числа, цифры в которых образуют
строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию
 */
public class Task15 {

    public static void main(String[] args) {
        int n = 5;

        printNumber(n);
    }


    //Находить все числа перебором нет необходимости. т.к. на каждые 10^(n-1) будет не более одного искомого числа.
    //Поэтому найдём первое из них, а остальные найдём добавлением 1 к каждой из цифр предыдущего числа.
    private static int getFirstNumber(int n) {
        int firstNumber = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (isNeedNumber(i, n)) {
                firstNumber = i;
                break;
            }
        }
        return firstNumber;
    }

    private static void printNumber(int n) {
        int number = getFirstNumber(n);
        System.out.println(number);
        int step = 1;

        // находим разницу между ближайшими нужными числами
        for (int i = 1; i < n; i++) {
            step += Math.pow(10, i);
        }

        //
        for (int i = 2; i <= 10 - n; i++) {
            number += step;
            System.out.println(number);
        }
    }

    private static boolean isNeedNumber(int number, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = number % 10;
            number /= 10;
            if (i >= 1) {   // После того как ввели две цифры сравниваем их. Если они удовлетворяют условию - продолжаем.
                if (array[i] + 1 == array[i - 1]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
