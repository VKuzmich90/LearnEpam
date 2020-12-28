package epam.learn.module5.basicsOfOOP.task5.entity.sweets;

public class Candy extends Sweetness{

    public Candy(String name, int cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "Candy: " + getCost() + "$";
    }
}
