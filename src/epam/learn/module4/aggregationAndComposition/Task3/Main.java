package epam.learn.module4.aggregationAndComposition.Task3;

/** Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Main {

    public static void main(String[] args) {

        City minsk = new City("Minsk");

        Region minskRegion = new Region("Минская область", minsk);
        minskRegion.addDistrict(new District("Минский район", 2_000_000, 15000, minsk));

        Region gomelRegion = new Region("Гомельская область", new City("Гомель"));
        gomelRegion.addDistrict(new District("Речицикй район", 50000, 16000, new City("Речица")));
        gomelRegion.addDistrict(new District("Мозырьский район", 150000, 27000, new City("Мозырь")));

        Region grodnoRegion = new Region("Гродненская область", new City("Гродно"));
        grodnoRegion.addDistrict(new District("Лидский район", 120000, 45000, new City("Лида")));
        grodnoRegion.addDistrict(new District("Щучинский район", 45000, 41000, new City("Щучин")));

        Region brestRegion = new Region("Брестская область", new City("Брест"));
        brestRegion.addDistrict(new District("Пинский район", 110000, 73000, new City("Пинск")));
        brestRegion.addDistrict(new District("Барановичский район", 200000, 51000, new City("Барановичи")));

        Region vitebskRegion = new Region("Витебская область", new City("Витебск"));
        vitebskRegion.addDistrict(new District("Полоцкий район", 175000, 52000, new City("Полоцк")));
        vitebskRegion.addDistrict(new District("Оршанский район", 110000, 61000, new City("Орша")));

        Region mogilevRegion = new Region("Могилёвскаяя область", new City("Могилёв"));
        mogilevRegion.addDistrict(new District("Бобруйский район", 180000, 56000, new City("Бобруйск")));
        mogilevRegion.addDistrict(new District("Осиповичский район", 45000, 45000, new City("Осиповичи")));

        Country belarus = new Country("Belarus", minsk);

        belarus.addRegion(minskRegion);
        belarus.addRegion(gomelRegion);
        belarus.addRegion(grodnoRegion);
        belarus.addRegion(vitebskRegion);
        belarus.addRegion(brestRegion);
        belarus.addRegion(mogilevRegion);


        belarus.printCapital();
        belarus.printRegions();
        belarus.printRegionCity();
        belarus.printArea();

    }
}
