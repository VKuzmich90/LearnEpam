package epam.learn.module4.simpleClasses.Task5;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию
и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Counter {

    private int minValue;
    private int maxValue;
    private int currentValue;

    public Counter() {
        this.minValue = 0;
        this.maxValue = 100;
        this.currentValue = 50;
    }

    public Counter(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public void up() {
        currentValue++;

        if (currentValue == maxValue) {
            System.out.println("Достигнуто максимальное значение");
        } else if (currentValue > maxValue) {
            System.out.println("Выход за максимальное значение");
            currentValue--;
        }
    }

    public void down() {
        currentValue--;

        if (currentValue == minValue) {
            System.out.println("Достигнуто минимальное значение");
        } else if (currentValue < minValue) {
            System.out.println("Выход за минимальное значение");
            currentValue++;
        }
    }

    public int getCurrentValue() {
        return this.currentValue;
    }

}
