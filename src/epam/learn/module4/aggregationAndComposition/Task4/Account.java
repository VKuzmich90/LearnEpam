package epam.learn.module4.aggregationAndComposition.Task4;
/**Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 имеющим положительный и отрицательный балансы отдельно.
*/

public class Account {

    private long id;

    private double balance;

    private boolean isOpen = true;

    public Account(double balance, long id) {
        this.balance = balance;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getStatus() {
        String status = isOpen ? "Разблокирован" : "Заблокирован";
        return String.format("Счёт %d %s.", id, status);
    }

    public void lock(){
        isOpen = false;
    }

    public void unlock() {
        isOpen = true;
    }

}
