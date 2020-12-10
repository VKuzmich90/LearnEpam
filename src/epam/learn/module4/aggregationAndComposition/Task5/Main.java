package epam.learn.module4.aggregationAndComposition.Task5;

import java.util.Comparator;
import java.util.List;

import static epam.learn.module4.aggregationAndComposition.Task5.TourAgency.printTours;
import static epam.learn.module4.aggregationAndComposition.Task5.TourPackageType.EXCURSION;
import static epam.learn.module4.aggregationAndComposition.Task5.Transport.PLANE;
import static epam.learn.module4.aggregationAndComposition.Task5.TypeOfFood.BREAKFAST;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

    public static void main(String[] args) {

        TourAgency tezTour = new TourAgency("TEZ TOUR");

        tezTour.addTourPackage(new TourPackage("Испания", TourPackageType.CRUISE,
                Transport.SHIP, BREAKFAST, 12, 1100));

        tezTour.addTourPackage(new TourPackage("Испания", EXCURSION,
                Transport.BUS, TypeOfFood.NOT_INCLUDED, 7, 500));

        tezTour.addTourPackage(new TourPackage("Испания", TourPackageType.TREATMENT,
                Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 7, 600));

        tezTour.addTourPackage(new TourPackage("Италия", EXCURSION,
                PLANE, TypeOfFood.ALL_INCLUSIVE, 10, 930));

        tezTour.addTourPackage(new TourPackage("Италия", TourPackageType.CRUISE,
                Transport.SHIP, BREAKFAST, 15, 1300));

        tezTour.addTourPackage(new TourPackage("Италия", TourPackageType.SHOPPING,
                PLANE, BREAKFAST, 5, 400));

        tezTour.addTourPackage(new TourPackage("Италия", TourPackageType.RECREATION,
                Transport.TRAIN, TypeOfFood.ALL_INCLUSIVE, 13, 1250));

        System.out.println("Фильтрация по типу экскурсии и стране:");
        List<TourPackage> tours1 = tezTour.searchToursByType(tezTour.getTourPackages(), EXCURSION);
        tours1 = tezTour.searchToursByCountry(tours1, "Италия");
        printTours(tours1);

        System.out.println("\nФильтрация по транспорту, питанию, количеству дней:");
        List<TourPackage> tours2 = tezTour.searchToursByTransport(tezTour.getTourPackages(), PLANE);
        tours2 = tezTour.searchToursByFood(tours2, BREAKFAST);
        tours2 = tezTour.searchToursByDays(tours2, 5, 10);
        printTours(tours2);

    }
}

