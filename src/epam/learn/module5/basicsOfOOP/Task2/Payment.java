package epam.learn.module5.basicsOfOOP.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Payment с внутренним классом,
 * с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Payment {

    private static class Product {

        public String name;

        public int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    private final List<Product> products = new ArrayList<>();

    public Payment() {
    }

    public void addProduct(String name, int price) {
        products.add(new Product(name, price));
    }

    public int getAmount() {
        int amount = 0;

        for (Product product : products) {
            amount += product.price;
        }

        return amount;
    }

    public void printPayment(){
        products.stream().forEach(System.out::println);
        System.out.println("Total amount of payment = " + getAmount());
    }


}
