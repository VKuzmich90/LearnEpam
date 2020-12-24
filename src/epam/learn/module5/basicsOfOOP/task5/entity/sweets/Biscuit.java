package epam.learn.module5.basicsOfOOP.task5.entity.sweets;

public class Biscuit extends Sweetness{

    public Biscuit(String name, int cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "Biscuit: " + getCost() + "$";
    }
}
