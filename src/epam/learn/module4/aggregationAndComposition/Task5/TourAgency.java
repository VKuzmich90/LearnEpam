package epam.learn.module4.aggregationAndComposition.Task5;
/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TourAgency {

    private String nameOfTourOperator;

    private final List<TourPackage> tourPackages = new ArrayList<>();

    public TourAgency(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
    }

    public void addTourPackage(TourPackage tour) {
        tourPackages.add(tour);
    }

    public List<TourPackage> searchToursByType(List<TourPackage> tours, TourPackageType type) {
        return tours.stream().filter(o -> o.getType().equals(type)).collect(Collectors.toList());
    }

    public List<TourPackage> searchToursByPrice(List<TourPackage> tours, int minPrice, int maxPrice) {
        return tours.stream().filter(o -> o.getPrice() >= minPrice && o.getPrice() <= maxPrice).collect(Collectors.toList());
    }

    public List<TourPackage> searchToursByCountry(List<TourPackage> tours, String country) {
        return tours.stream().filter(o -> o.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());
    }

    public List<TourPackage> searchToursByDays(List<TourPackage> tours, int minDays, int maxDays) {
        return tours.stream().filter(o -> o.getNumberOfDays() >= minDays && o.getNumberOfDays() <= maxDays).collect(Collectors.toList());
    }

    public List<TourPackage> searchToursByTransport(List<TourPackage> tours, Transport transport) {
        return tours.stream().filter(o -> o.getTransport().equals(transport)).collect(Collectors.toList());
    }

    public List<TourPackage> searchToursByFood(List<TourPackage> tours, TypeOfFood food) {
       return tours.stream().filter(o -> o.getFood().equals(food)).collect(Collectors.toList());
    }


    public static void printTours(List<TourPackage> tours) {

        if (tours.size() == 0) {
            System.out.println("Подходящих туров нет");
            return;
        }
        for (TourPackage tour : tours) {
            System.out.printf("%s, тип: %s, трансфер:%s, питание: %s, дней: %d, цена: %.2f euro.\n",
                    tour.getCountry(), tour.getType(), tour.getTransport(), tour.getFood(),
                    tour.getNumberOfDays(), tour.getPrice());
        }
    }


    public String getNameOfTourOperator() {
        return nameOfTourOperator;
    }

    public void setNameOfTourOperator(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
    }

    public List<TourPackage> getTourPackages() {
        return tourPackages;
    }


}

