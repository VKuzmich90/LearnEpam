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
public enum TreasureType {

    GOLD("Gold", 1),
    AMETHYST("Amethyst", 5),
    EMERALD("Emerald", 10),
    RUBY("Ruby", 25),
    TOPAZ("Topaz", 20),
    DIAMOND("Diamond", 50);

    private final String name;

    private final int price;

    TreasureType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }

}
