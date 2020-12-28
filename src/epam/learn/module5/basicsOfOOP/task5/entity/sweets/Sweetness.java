package epam.learn.module5.basicsOfOOP.task5.entity.sweets;

public class Sweetness {

    private String name;

    private int cost;

    public Sweetness(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Sweets: " + getName() + ", " + getCost() + ".";
    }

}
