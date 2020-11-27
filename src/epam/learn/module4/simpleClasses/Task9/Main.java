package epam.learn.module4.simpleClasses.Task9;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PrintBooks printBook = new PrintBooks();

        BookShop list = getBase();

        printBook.printAuthor(list, "Оруэлл");

        printBook.printPublisher(list, "ЛитРес");

        printBook.printAfterYear(list, 1940);


    }

    public static BookShop getBase() {
        BookShop list = new BookShop("Книжная Шафа", new ArrayList<>());

        list.addBook(101, "1984", "Оруэлл", "Росмэн",
                1948, 354, 23, "твёрдый");

        list.addBook(102, "Скотный двор", "Оруэлл", "ЛитРес",
                1952, 172, 20, "мягкий");

        list.addBook(103, "Граф Монте-Кристо", "А.Дюма", "ПарижИздат",
                1971, 511, 14, "твёрдый");

        list.addBook(104, "Три мушкетёра", "А.Дюма", "ЛитРес",
                1955, 256, 31, "мягкий");

        list.addBook(105, "Шерлок Холмс", "Конан-Дойль", "Росмэн",
                1913, 704, 37, "твёрдый");

        return list;
    }
}
