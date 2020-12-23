package epam.learn.module4.aggregationAndComposition.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный балансы отдельно.
 */

public class Bank {

    private String name;

    private List<Client> clients = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Client getClient(String passportID) {
        Optional<Client> person = clients.stream().filter(o -> o.getPassportID().equals(passportID)).findFirst();

        return person.get();

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
