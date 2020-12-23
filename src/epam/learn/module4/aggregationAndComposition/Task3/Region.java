package epam.learn.module4.aggregationAndComposition.Task3;

/** Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.List;

public class Region {

    private String name;

    private City regionCenter;

    private List<District> districts = new ArrayList<>();

    private double area;

    public Region(String name, City regionCenter) {
        this.name = name;
        this.regionCenter = regionCenter;
    }

    void addDistrict (District district) {
        districts.add(district);
    }

    void removeDistrict (String districtName) {
        for (District district : districts) {
            if (districtName.equals(district.getName())) {
                districts.remove(district);
            }
        }
    }




    public double getArea() {
        double area = 0;

        for (District district: this.districts) {
            area += district.getArea();
        }
        return area;
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

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }
}
