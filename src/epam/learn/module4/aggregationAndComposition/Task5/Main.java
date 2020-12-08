package epam.learn.module4.aggregationAndComposition.Task5;
/**Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        TourAggregator tezTour = new TourAggregator("TEZ TOUR");


        tezTour.addTourPackage(new TourPackage("Испания", "Барселона", TourPackageType.CRUISE,
                Transport.SHIP, TypeOfFood.BREAKFAST, 12, 1100));

        tezTour.addTourPackage(new TourPackage("Испания", "Мадрид", TourPackageType.EXCURSION,
                Transport.BUS, TypeOfFood.NOT_INCLUDET, 7, 500));

        tezTour.addTourPackage(new TourPackage("Испания", "Барселона", TourPackageType.TREATMENT,
                Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 7, 600));

        tezTour.addTourPackage(new TourPackage("Италия", "Рим", TourPackageType.EXCURSION,
                Transport.PLANE, TypeOfFood.ALL_INCLUSIVE, 10, 930));

        tezTour.addTourPackage(new TourPackage("Италия", "Вениция", TourPackageType.CRUISE,
                Transport.SHIP, TypeOfFood.BREAKFAST, 15, 1300));

        tezTour.addTourPackage(new TourPackage("Италия", "Милан", TourPackageType.SHOPPING,
                Transport.PLANE, TypeOfFood.BREAKFAST, 5, 400));

        tezTour.addTourPackage(new TourPackage("Италия", "Флоренция", TourPackageType.RECREATION,
                Transport.TRAIN, TypeOfFood.ALL_INCLUSIVE, 13, 1250));


        System.out.println("Экскурсии:");
        ArrayList<TourPackage> selectByType = tezTour.selectByTourPackageType(TourPackageType.EXCURSION);
        TourAggregator.printTours(selectByType);

        System.out.println("\nТранспорт - корабль:");
        ArrayList<TourPackage> selectByOption = tezTour.selectByMoreOption(Transport.SHIP);
        TourAggregator.sortByNumberOfDays(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nТранспорт - самолёт, питание - завтраки:");
        selectByOption = tezTour.selectByMoreOption(Transport.PLANE, TypeOfFood.BREAKFAST);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nТранспорт - автобус, всё включено, 7 дней:");
        selectByOption = tezTour.selectByMoreOption(Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 7);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nНа 5 дней:");
        selectByOption = tezTour.selectByMoreOption(5);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

    }
}

