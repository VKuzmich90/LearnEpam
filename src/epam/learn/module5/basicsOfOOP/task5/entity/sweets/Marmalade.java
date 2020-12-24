package epam.learn.module5.basicsOfOOP.task5.entity.sweets;

public class Marmalade extends Sweetness{

    public Marmalade(String name, int cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "Marmalade: " + getCost() + "$";
    }
}
