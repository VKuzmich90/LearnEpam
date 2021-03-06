package epam.learn.module2.decompositionUsingMethods;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

// Cтало работать с отрицательными числами.
public class Task11 {

    public static void main(String[] args) {
        int number1 = 123456;
        int number2 = -9876543;

        getMaxNumerals(number1, number2);
    }

    private static int getMaxNumerals(int number1, int number2) {
        int copy1 = Math.abs(number1);
        int copy2 = Math.abs(number2);

        while (copy1 > 0 && copy2 > 0) {
            copy1 /= 10;
            copy2 /= 10;
        }

        int maxNumerals = 0;

        if (copy1 != copy2) {
            maxNumerals = copy1 == 0? number2 : number1;
            System.out.println("Больше цифр в числе " + maxNumerals);
        } else {
            System.out.println("Количество цифр в обоих числах одинаково");
        }
        return maxNumerals;
    }
}
