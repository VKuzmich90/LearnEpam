package epam.learn.module2.decompositionUsingMethods;

import java.util.ArrayList;

/*
Даны натуральные числа К и N.
Написать метод(методы) формирования массива А, элементами которого являются числа,
сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {

    public static void main(String[] args) {
        int k = 8;
        int n = 195;

        getArray(k, n);
    }

    private static ArrayList<Integer> getArray(int k, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int copy = 0;

        for (int i = 1; i < n; i++) {
            copy = i;
            int sum = 0;

            while (copy > 0) {
                sum += copy % 10;
                copy /= 10;
            }

            if (sum == k) {
                System.out.print(i + " ");
                list.add(sum);
            }
        }
        return list;
    }
}
