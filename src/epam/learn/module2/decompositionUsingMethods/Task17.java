package epam.learn.module2.decompositionUsingMethods;
/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */
public class Task17 {

    public static void main(String[] args) {
        int number = 1345698;

        getCounter(number);
    }

    private static int getCounter(int number) {
        int counter = 0;

        while (number > 0) {
            number -= getSum(number);
            counter++;
        }
        System.out.println("Количество вычитаний: " + counter);
        return counter;
    }

    private static int getSum (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
