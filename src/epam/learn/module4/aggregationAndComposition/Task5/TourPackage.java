package epam.learn.module4.aggregationAndComposition.Task5;

/**Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TourPackage {

    private String country;

    private TourPackageType type;

    private Transport transport;

    private TypeOfFood food;

    private int numberOfDays;

    private double price;

    public TourPackage(String country, TourPackageType type, Transport transport, TypeOfFood food, int numberOfDays, double price) {
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TourPackageType getType() {
        return type;
    }

    public Transport getTransport() {
        return transport;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
