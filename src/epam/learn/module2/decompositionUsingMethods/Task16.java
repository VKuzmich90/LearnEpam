package epam.learn.module2.decompositionUsingMethods;

/* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
 */
// придумал формулу для суммы всех необходимых чисел.
public class Task16 {

    public static void main(String[] args) {
        int n = 4;
        long start = System.currentTimeMillis();

        System.out.println("Сумма: " + getSum(n));
        System.out.println("В сумме чётных чисел: " + getEvenNumerals(n));

        long finish = System.currentTimeMillis();
        System.out.println("Время выполение: " + (finish - start) + ", мc");
    }

    private static long getSum(int n) {
        long sumFirstAndLast = 0;

        for (int i = 0; i < n ; i++) {
            sumFirstAndLast += (long)Math.pow(10, n - i);
        }

        long sum = (long)Math.pow(5, n) * sumFirstAndLast / 2;

        //СТАРОЕ РЕШЕНИЕ
//        int firstNumber = 0;
//
//        for (int i = 1; i <= n; i++) {
//            firstNumber += (int) Math.pow(10, n - i);
//        }
//
//        for (int i = firstNumber; i < Math.pow(10, n); i += 2) {
//            if (i / (int) Math.pow(10, n - 1) % 2 == 1) { //сократили поле перебора
//                if (isNeedNumber(i, n)) {
//                    sum += i;
//                }
//            }
//        }
        return sum;
    }

    private static int getEvenNumerals(int n) {
        long sum = getSum(n);
        int counter = 0;

        while (sum > 0) {

            if (sum % 2 == 0) {
                counter++;
            }
            sum /= 10;
        }

        return counter;
    }
// МЕТОД для старого решения
//    private static boolean isNeedNumber(int number, int n) {
//        for (int i = 0; i < n; i++) {
//
//            if (number % 2 == 1) {
//                number /= 10;
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
}

