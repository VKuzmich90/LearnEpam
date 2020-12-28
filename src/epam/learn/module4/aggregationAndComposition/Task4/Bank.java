package epam.learn.module4.aggregationAndComposition.Task4;

import java.util.*;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный балансы отдельно.
 */

public class Bank {

    private String name;

    //private List<Client> clients = new ArrayList<>();

    private Map<String, Client> clientsMap = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public Client getClient(String passportID) {
     return clientsMap.get(passportID);
    }

    public void addNewClient(Client client) {
        clientsMap.put(client.getPassportID(), client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("В %s %d клиентов", name, clientsMap.values().size());
    }
}
