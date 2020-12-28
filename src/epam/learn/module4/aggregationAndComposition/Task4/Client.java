package epam.learn.module4.aggregationAndComposition.Task4;

import java.util.*;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный балансы отдельно.
 */

public class Client {

    private String firstName;

    private String lastName;

    private String passportID;

    private Map<Integer, Account> accountsMap = new HashMap<>();

    public Client(String firstName, String lastName, String passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
    }

    public double getBalance() {
        double balance = 0;

        for (Account account : accountsMap.values()) {
            balance += account.getBalance();
        }

        return balance;
    }

    public double getBalancePositiveAccounts() {
        double balance = 0;

        for (Account account : accountsMap.values()) {

            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }

        }

        return balance;
    }

    public double getBalanceNegativeAccounts() {
        double balance = 0;

        for (Account account : accountsMap.values()) {

            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }

        }

        return balance;
    }

    public List<Account> sortByBalance() {
        List<Account> accountList = new ArrayList<>(accountsMap.values());
        accountList.sort(Comparator.comparing(Account::getBalance));

        return accountList;
    }

    public Account getAccount(Integer id) {
        return accountsMap.get(id);
    }

    public void openAccount(Account account) {
        accountsMap.put(account.getId(), account);
    }

    public String getInformation() {
        String information = "";

        for (Account account : accountsMap.values()) {
            information += String.format("#%d, баланс: %.2f BYN, cтатус: %s\n", account.getId(), account.getBalance(), account.getStatus());
        }
        return String.format("У клиента %s следующие счета:\n%s", toString(), information);
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Паспорт: %s", firstName, lastName, passportID);
    }

}
