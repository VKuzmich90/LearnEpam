package epam.learn.module4.simpleClasses.Task1;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.
 */
public class RunTest1 {

    public static void main(String[] args) {

        Test1 test = new Test1();

        test.print();
        System.out.println("\nCумма: " + test.getSum());
        System.out.println("Максимум: " + test.getMax() + "\n");

        test.setA(3);
        test.setB(4);

        test.print();
        System.out.println("\nCумма: " + test.getSum());
        System.out.println("Максимум: " + test.getMax());
    }
}
