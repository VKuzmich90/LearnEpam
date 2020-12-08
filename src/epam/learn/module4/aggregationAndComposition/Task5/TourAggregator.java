package epam.learn.module4.aggregationAndComposition.Task5;
/**Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class TourAggregator {

    private String nameOfTourOperator;

    private ArrayList<TourPackage> tourPackages;


    public TourAggregator(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
        tourPackages = new ArrayList<>();
    }

  public void addTourPackage (TourPackage tour) {
        tourPackages.add(tour);
    }

   public ArrayList<TourPackage> selectByTourPackageType (TourPackageType type){

        ArrayList<TourPackage> packages = new ArrayList<>();

        for (TourPackage tour : tourPackages) {

            if (tour.getType().equals(type)) {
                packages.add(tour);
            }
        }

        return packages;
    }

    public ArrayList<TourPackage> selectByMoreOption (Transport transport){

        ArrayList<TourPackage> packages = new ArrayList<>();

        for (TourPackage tour : tourPackages) {

            if (tour.getTransport().equals(transport)) {
                packages.add(tour);
            }
        }

        return packages;
    }

    public ArrayList<TourPackage> selectByMoreOption (Transport transport, TypeOfFood food){

        ArrayList<TourPackage> packages = new ArrayList<>();

        for (TourPackage tour : tourPackages) {

            if (tour.getTransport().equals(transport) && tour.getFood().equals(food)) {

                packages.add(tour);
            }
        }

        return packages;
    }

    public ArrayList<TourPackage> selectByMoreOption (Transport transport, TypeOfFood food, int days){

        ArrayList<TourPackage> packages = new ArrayList<>();

        for (TourPackage tour : tourPackages) {

            if (tour.getTransport().equals(transport) && tour.getFood().equals(food) && tour.getNumberOfDays() == days) {
                packages.add(tour);
            }
        }

        return packages;
    }

    public ArrayList<TourPackage> selectByMoreOption (int days){

        ArrayList<TourPackage> packages = new ArrayList<>();

        for (TourPackage tour : tourPackages) {

            if (tour.getNumberOfDays() == days) {
                packages.add(tour);
            }
        }

        return packages;
    }

    public static void printTours (ArrayList<TourPackage> packages) {

        if (packages.size() == 0) {
            System.out.println("Подходящих туров нет");
            return;
        }
        for (TourPackage tour : packages) {
            System.out.printf("%s, %s, тип: %s, трансфер:%s, питание: %s, дней: %d, цена: %.2f euro.\n",
                    tour.getCountry(), tour.getCity(), tour.getType(), tour.getTransport(), tour.getFood(),
                    tour.getNumberOfDays(), tour.getPrice());
        }
    }


    public static void sortByPrice(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getPrice));
    }

    public static void sortByNumberOfDays(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getNumberOfDays));
    }

    public String getNameOfTourOperator() {
        return nameOfTourOperator;
    }

    public void setNameOfTourOperator(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
    }

    public ArrayList<TourPackage> getTourPackages() {
        return tourPackages;
    }

    public void setTourPackages(ArrayList<TourPackage> tourPackages) {
        this.tourPackages = tourPackages;
    }
}

