package epam.learn.module4.aggregationAndComposition.Task3;

/* Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Main {

    public static void main(String[] args) {

        City minsk = new City("Minsk", 2_000_000);

        Country belarus = new Country("Belarus", minsk);

        belarus.addRegion(new Region("Брестская область", new City("Брест", 400_000), 31600));
        belarus.addRegion(new Region("Витебская область", new City("Витебск", 500_000), 32000));
        belarus.addRegion(new Region("Гомельская область", new City("Гомель", 600_000), 37000));
        belarus.addRegion(new Region("Гродненская область", new City("Гродно", 420_000), 36000));
        belarus.addRegion(new Region("Могилёвская область", new City("Могилёв", 550_000), 31000));
        belarus.addRegion(new Region("Минская область", minsk, 40000));

        belarus.printCapital();
        belarus.printRegions();
        belarus.printRegionCity();
        belarus.printArea();


    }
}
