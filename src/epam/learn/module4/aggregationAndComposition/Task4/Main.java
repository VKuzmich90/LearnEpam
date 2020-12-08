package epam.learn.module4.aggregationAndComposition.Task4;

/**Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

    public static void main(String[] args) {

        Bank belarusBank = new Bank("Беларусбанк");

        Client ivanov = new Client("Иван", "Иванов", "MC1112233");
        Client petrov = new Client("Пётр", "Петров", "MC4445577");

        belarusBank.addNewClient(ivanov);
        belarusBank.addNewClient(petrov);

        ivanov.openAccount(new Account(107.34, 01));
        ivanov.openAccount(new Account(199.04, 02));
        ivanov.openAccount(new Account(-123.34, 03));
        ivanov.openAccount(new Account(234.13, 04));

        petrov.openAccount(new Account(151.80, 11));
        petrov.openAccount(new Account(-99.99, 12));
        petrov.openAccount(new Account(1001.01, 13));
        petrov.openAccount(new Account(345.34, 14));

        //Блокируем счёт
        System.out.println(belarusBank.getClient("MC1112233").getAccount(1).getStatus());
        belarusBank.getClient("MC1112233").blockAccaunt(1);
        System.out.println(belarusBank.getClient("MC1112233").getAccount(1).getStatus() + "\n");

        //Сортируем счёта по балансу
        belarusBank.getClient("MC1112233").sortByBalance();
        System.out.println(belarusBank.getClient("MC1112233").getInformation());

        belarusBank.getClient("MC4445577").sortByBalance();
        System.out.println(belarusBank.getClient("MC4445577").getInformation());

        //Выводим итоговый баланс
        System.out.println(ivanov.toString() + ", Итоговый баланс: " + ivanov.getBalance());
        System.out.println(petrov.toString() + ", Итоговый баланс: " + petrov.getBalance());

        //Выводим отрицательый баланс счетов
        System.out.println();
        System.out.println(ivanov.toString() + ", Положительный баланс: " + ivanov.getBalancePositiveAccounts());
        System.out.println(petrov.toString() + ", Положительный баланс: " + petrov.getBalancePositiveAccounts());

        //Выводим отрицательный баланс счетов
        System.out.println();
        System.out.println(ivanov.toString() + ", Отрицательный баланс: " + ivanov.getBalanceNegativeAccounts());
        System.out.println(petrov.toString() + ", Отрицательный баланс: " + petrov.getBalanceNegativeAccounts());
    }
}
