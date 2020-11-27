package epam.learn.module4.simpleClasses.Task5;

import java.io.IOException;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Counter{

    private int minValue;
    private int maxValue;
    private int currentValue;


    public Counter(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public Counter() {
        this(0, 100, 50);
    }

    public void increment() throws IOException {
        boolean islimitvalue = false;
        currentValue++;

        if (currentValue == maxValue) {
            System.out.println("Достигнуто максимальное значение");
        } else if (currentValue > maxValue) {
            islimitvalue = true;
        }

        if (islimitvalue) {
            throw new RuntimeException("going beyond the counter");
        }
    }

    public void decrement() throws IOException {
        boolean islimitvalue = false;
        currentValue--;


        if (currentValue == minValue) {
            System.out.println("Достигнуто минимальное значение");
        } else if (currentValue < minValue) {
            islimitvalue = true;
            currentValue++;
        }

        if (islimitvalue) {
            throw new RuntimeException("going beyond the counter");
        }
    }

    public int getCurrentValue() {
        return this.currentValue;
    }

    @Override
    public String toString() {
        return "Текущее значение счётчика: " + getCurrentValue();
    }
}
