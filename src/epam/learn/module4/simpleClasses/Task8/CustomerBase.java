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

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerBase {


    private ArrayList<Customer> base;

    public CustomerBase(ArrayList<Customer> base) {
        this.base = base;
    }

    public ArrayList<Customer> sortByName() {
        base.sort(Comparator.comparing(Customer::getLastName));
        return base;
    }

    public ArrayList<Customer> sortCustomersByCard( long minNumber, long maxNumber) {
        ArrayList<Customer> list = new ArrayList<>();

        for (Customer customer : base) {

            if (customer.getCardNumber() > minNumber
                    && customer.getCardNumber() < maxNumber) {
                list.add(customer);
            }
        }
        list.sort(Comparator.comparing(Customer::getCardNumber));
        return list;
    }

    public void addCustomer(int id, String lastName, String firstName, String patronymic, String address, long cardNumber, long bankAccountNumber) {
        base.add(new Customer(id, lastName, firstName, patronymic, address, cardNumber, bankAccountNumber));
    }

    ArrayList<Customer> getBase() {
        return base;
    }

}
