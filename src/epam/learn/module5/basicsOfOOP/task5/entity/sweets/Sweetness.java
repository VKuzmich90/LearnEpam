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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (name == null ? 0 : name.hashCode());
        result = result * prime + cost;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Sweetness other = (Sweetness) obj;

        if (name == null) {

            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }


        return true;
    }

    @Override
    public String toString() {
        return "Sweets: " + getName() + ", " + getCost() + ".";
    }


}
