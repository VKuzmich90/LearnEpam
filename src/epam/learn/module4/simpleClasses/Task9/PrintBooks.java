package epam.learn.module4.simpleClasses.Task9;

import java.util.ArrayList;

public final class PrintBooks {

    public static void printByAuthor(BookShop list, String author) {
        System.out.println("Книги " + author);

        ArrayList<Book> authors = list.authorsBooks(author);

        for (Book book : authors) {
            System.out.println(book);
        }
    }

    public static void printByPublisher(BookShop list, String publisher) {
        System.out.println("Книги, изданные " + publisher);

        ArrayList<Book> publishersBook = list.publishersBook(publisher);

        for (Book book : publishersBook) {
            System.out.println(book);
        }
    }

    public static void printAfterYear(BookShop list, int year) {
        System.out.println("Книги, изданные после " + year);

        ArrayList<Book> releasedAfter = list.releasedAfter(year);

        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}
