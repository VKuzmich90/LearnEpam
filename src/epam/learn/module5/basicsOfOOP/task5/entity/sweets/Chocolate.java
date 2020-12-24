package epam.learn.module5.basicsOfOOP.task5.entity.sweets;

public class Chocolate extends Sweetness{

    public Chocolate(String name, int cost) {
        super(name, cost);
    }


    @Override
    public String toString() {
        return "Chocolate " + getCost() + "$";
    }
}
