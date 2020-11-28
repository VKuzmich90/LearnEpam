package epam.learn.module4.aggregationAndComposition.Task3;

/* Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class District {

    private String name;

    private int population;

    private double area;

    private City districtCenter;

    public District(String name, int population, int area, City districtCenter) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.districtCenter = districtCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }
}
