package epam.learn.module4.aggregationAndComposition.Task4;

import java.util.ArrayList;

/**Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 имеющим положительный и отрицательный балансы отдельно.
 */

public class Bank {

    private String name;

    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public Client getClient (String passportID) {
        for (Client person : clients) {
            if (person.getPassportID().equals(passportID)) {
                return person;
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("В %s %d клиентов", name, clients.size());
    }
}
