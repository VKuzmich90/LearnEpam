package epam.learn.module4.simpleClasses.Task1;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.
 */
public class Test1 {

    private int a = 7;

    private int b = 3;

    public void print() {
        System.out.printf("a = %d, b = %d", a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        if (a > b) {
            return a;
        }

        return b;
    }
}
