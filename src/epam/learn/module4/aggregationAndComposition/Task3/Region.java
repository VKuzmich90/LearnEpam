package epam.learn.module4.aggregationAndComposition.Task3;

/* Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;

public class Region {

    private String name;

    private City regionCenter;

    private double area;

    private ArrayList<District> districts;

    public Region(String name, City regionCenter, double area) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.area = area;
        this.districts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        int population = 0;

        for (District district: this.districts) {
            population += district.getPopulation();
        }
        return population;
    }


    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }
}
