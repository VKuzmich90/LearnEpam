package epam.learn.module4.simpleClasses.Task5;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

import java.io.IOException;

public class RunCounter {

    public static void main(String[] args) throws IOException {


        // Проверка первого счётчика
        Counter counter1 = new Counter();
        System.out.println(counter1.toString());

        for (int i = 0; i < 5; i++) {
            counter1.increment();
            System.out.println(counter1.toString());
        }

        System.out.println(counter1.toString());
        for (int i = 0; i < 10; i++) {
            counter1.decrement();
            System.out.println(counter1.toString());
        }

        // Проверка второго счётчика
        Counter counter2 = new Counter(1, 10, 3);
        System.out.println(counter2.toString());

        for (int i = 0; i < 8; i++) {
            counter2.increment();
            System.out.println(counter2.toString());
        }

        System.out.println(counter1.toString());
        for (int i = 0; i < 10; i++) {
            counter2.decrement();
            System.out.println(counter2.toString());
        }
    }
}
