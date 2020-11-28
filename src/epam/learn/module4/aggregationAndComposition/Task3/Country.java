package epam.learn.module4.aggregationAndComposition.Task3;

/* Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Country {

    private String name;

    private City capital;

    private ArrayList<Region> regions;

    public Country(String name, City capital) {
        this.name = name;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public void printCapital(){
        System.out.println("Столица - " + getCapital());
    }

    public void printRegions(){
        System.out.println("Количество областей: " + getRegions().size());
    }

    public void printRegionCity(){
        for (Region region: regions) {
            System.out.println(region.getRegionCenter() + " ");

        }
    }


    public int getPopulation() {
        int population = 0;

        for (Region region: this.regions) {
            population += region.getPopulation();
        }

        return population;
    }

    public void printArea() {
        double area = 0;

        for (Region region: this.regions) {
            area += region.getArea();
        }

        System.out.println("Площадь страны:" + area);
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    void removeRegion(String name) {

        for (Region region : regions) {

            if (name.equals(region.getName())) {
                regions.remove(region);
            }
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }


}
