package epam.learn.module4.simpleClasses.Task5;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class RunCounter {

    public static void main(String[] args) {

        // Проверка первого счётчика
        Counter counter1 = new Counter();
        System.out.println("Текущее значение счётчика 1: " + counter1.getCurrentValue());

        for (int i = 0; i < 5; i++) {
            counter1.up();
            System.out.println(counter1.getCurrentValue());
        }

        System.out.println("Текущее значение счётчика 1: " + counter1.getCurrentValue());
        for (int i = 0; i < 10; i++) {
            counter1.down();
            System.out.println(counter1.getCurrentValue());
        }

        // Проверка второго счётчика
        Counter counter2 = new Counter(1, 10, 3);
        System.out.println("Текущее значение счётчика 2: " + counter2.getCurrentValue());

        for (int i = 0; i < 8; i++) {
            counter2.up();
            System.out.println(counter2.getCurrentValue());
        }

        System.out.println("Текущее значение счётчика 2: " + counter2.getCurrentValue());
        for (int i = 0; i < 10; i++) {
            counter2.down();
            System.out.println(counter2.getCurrentValue());
        }


    }
}
