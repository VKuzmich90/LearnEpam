package epam.learn.module4.simpleClasses.Task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class PrintPeople {

    public void printName(CustomerBase base) {
        System.out.println("Список покупателей в алфавитном порядке:");

        base.sortName();

        for (int i = 0; i < base.getBase().size(); i++) {
            System.out.println(base.getBase().get(i));
        }
    }


    public void printCustomersCard(CustomerBase base, long minNumber, long maxNumber ) {
        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится " +
                "в заданном интервале:");

        ArrayList<Customer> list = base.sortCustomersCard(minNumber, maxNumber);
        list.sort(Comparator.comparing(Customer::getCardNumber));

        for (Customer customer : list) {
            System.out.println(customer);
        }
    }
}