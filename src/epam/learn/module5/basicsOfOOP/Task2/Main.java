package epam.learn.module5.basicsOfOOP.Task2;

/**
 * Создать класс Payment с внутренним классом,
 * с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.addProduct("apple", 4);
        payment.addProduct("fish", 7);
        payment.addProduct("water", 1);

        payment.printPayment();
    }
}

