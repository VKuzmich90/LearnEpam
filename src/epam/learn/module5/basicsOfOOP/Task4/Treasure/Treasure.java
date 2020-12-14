package epam.learn.module5.basicsOfOOP.Task4.Treasure;
/**Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */

public class Treasure {

    private final TreasureType treasureType;

    private int amount;

    public Treasure(TreasureType treasureType, int amount) {
        this.treasureType = treasureType;
        this.amount = amount;
    }

    public Treasure(Treasure treasure, int newAmount) {
        this.treasureType = treasure.treasureType;
        this.amount = newAmount;
    }

    @Override
    public String toString() {
        return "Name: " + treasureType.getName() + ", price: " + treasureType.getPrice() + ", amount: " + amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public int getPrice() {
        return treasureType.getPrice();
    }

    public String getName() {
        return treasureType.getName();
    }
}
