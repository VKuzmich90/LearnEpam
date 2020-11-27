package epam.learn.module4.simpleClasses.Task8;
/*Создать класс Customer, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/


import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CustomerBase person = getBase();

        PrintPeople print = new PrintPeople();

        //Печатаем базу по алфавиту
        print.printName(person);

        // Печатаем базу в заданном интервале номеров кредитных карт
        print.printCustomersCard(person, 200000000, 400000000);

    }

    public static CustomerBase getBase() {
        CustomerBase persons = new CustomerBase(new ArrayList<>());

        persons.addCustomer(012, "Иванов", "Иван", "Иванович",
                "Минск", 111111111, 12345678);

        persons.addCustomer(013, "Петров", "Пётр", "Петрович",
                "Речица", 222222222, 23456789);

        persons.addCustomer(014, "Сидоров", "Егений", "Николаевич",
                "Самара", 333333333, 34567891);

        persons.addCustomer(015, "Андерсен", "Джон", "Александрович",
                "Копенгаген", 444444444, 45678912);

        persons.addCustomer(016, "Пушкин", "Александр", "Сергеевич",
                "Царское село", 555555555, 56789123);

        return persons;
    }
}
