package epam.learn.module4.simpleClasses.Task8;

import java.util.ArrayList;
import java.util.Comparator;

public final class PrintPeople {

    public static void printByName(CustomerBase base) {
        System.out.println("Список покупателей в алфавитном порядке:");

        base.sortByName();

        for (int i = 0; i < base.getBase().size(); i++) {
            System.out.println(base.getBase().get(i));
        }
    }


    public static void printCustomersByCard(CustomerBase base, long minNumber, long maxNumber ) {
        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится " +
                "в заданном интервале:");

        ArrayList<Customer> list = base.sortCustomersByCard(minNumber, maxNumber);
        list.sort(Comparator.comparing(Customer::getCardNumber));

        for (Customer customer : list) {
            System.out.println(customer);
        }
    }
}