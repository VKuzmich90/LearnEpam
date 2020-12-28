package epam.learn.module4.aggregationAndComposition.Task4;
/**Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 имеющим положительный и отрицательный балансы отдельно.
*/

public class Account {

    private Integer id;

    private Double balance;

    private boolean isOpen = true;

    public Account(Double balance, Integer id) {
        this.balance = balance;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
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
