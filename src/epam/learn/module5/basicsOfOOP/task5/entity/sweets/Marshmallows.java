package epam.learn.module5.basicsOfOOP.task5.entity.sweets;

public class Marshmallows extends Sweetness{

    public Marshmallows(String name, int cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "Marshmallow: " + getCost() + "$";
    }
}
