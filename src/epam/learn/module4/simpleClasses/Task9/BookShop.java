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
import java.util.ArrayList;

public class BookShop {

    private String bookShopName;

    private ArrayList<Book> bookList;

    BookShop(String shopName, ArrayList<Book> bookList) {
        this.bookShopName = shopName;
        this.bookList = bookList;
    }

    public void addBook(int id, String name, String author, String publisher, int yearOfPublishing,
                 int numberOfPages, int price, String bindingType) {

        this.bookList.add(new Book(id, name, author, publisher, yearOfPublishing, numberOfPages,
                price, bindingType));
    }

    // Коллекция авторов
    public ArrayList<Book> authorsBooks(String author) {

        ArrayList<Book> authorList = new ArrayList<>();

        for (Book book : this.bookList) {

            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    // Коллекция издательств
    public ArrayList<Book> publishersBook(String publisher) {

        ArrayList<Book> publisherList = new ArrayList<>();

        for (Book book : this.bookList) {

            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    //книги выпущенные после определённого года
    public ArrayList<Book> releasedAfter(int year) {

        ArrayList<Book> releasedAfterList = new ArrayList<>();

        for (Book book : this.bookList) {

            if (book.getYearOfPublishing() >= year) {
                releasedAfterList.add(book);
            }
        }
        return releasedAfterList;
    }

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
}


