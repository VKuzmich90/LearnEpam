package epam.learn.module4.simpleClasses.Task2;

/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */
public class RunTest2 {

    public static void main(String[] args) {

        Test2 first = new Test2(5, 6);
        Test2 second = new Test2();

        System.out.println("First a: " + first.getA());
        System.out.println("First b: " + first.getB());
        System.out.println("Second a: " + second.getA());
        System.out.println("Second b: " + second.getB());

        System.out.println("\nМеняем переменные:");
        first.setA(1);
        first.setB(2);
        second.setA(3);
        second.setB(4);

        System.out.println("First a: " + first.getA());
        System.out.println("First b: " + first.getB());
        System.out.println("Second a: " + second.getA());
        System.out.println("Second b: " + second.getB());
    }

    private void printValues() {

    }
}
