package epam.learn.module4.aggregationAndComposition.Task5;
/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TourAgency {

    private String nameOfTourOperator;

    private final List<TourPackage> tourPackages = new ArrayList<>();

    public TourAgency(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
    }

    public void addTourPackage(TourPackage tour) {
        tourPackages.add(tour);
    }

    public TourQuery search() {
        return new TourQuery(this);
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

    public void sortByPrice(List<TourPackage> tours) {
        tours.sort(Comparator.comparing(TourPackage::getPrice));
    }

    public void sortByNumberOfDays(List<TourPackage> tours) {
        tours.sort(Comparator.comparing(TourPackage::getNumberOfDays));
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
