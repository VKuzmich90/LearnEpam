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

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
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

    public void addProduct(String name, int price) {
        products.add(new Product(name, price));
    }

    public int getAmount() {
        int amount = products.stream().mapToInt(Product::getPrice).sum();

        return amount;
    }

    public void printPayment(){
        products.forEach(System.out::println);
        System.out.println("Total amount of payment = " + getAmount());
    }


}
