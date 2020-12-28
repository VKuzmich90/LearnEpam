package epam.learn.module5.basicsOfOOP.task5.entity;

import epam.learn.module5.basicsOfOOP.task5.entity.packaging.Box;
import epam.learn.module5.basicsOfOOP.task5.entity.sweets.Sweetness;

import java.util.ArrayList;
import java.util.List;

public class Present {

    private final List<Sweetness> sweets = new ArrayList<>();

    private Box box;

    public Present(Box box) {
        this.box = box;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public List<Sweetness> getSweets() {
        return sweets;
    }

    public void addSweets(Sweetness sweet) {
        sweets.add(sweet);
    }

    public int sumCost() {
        return sweets.stream().mapToInt(Sweetness::getCost).sum();
    }

    @Override
    public String toString() {
        return "Gift: material " + box.getBoxMaterial() + ", colour: "
                + box.getColour() + "." + "\nSweets in a box: " + sweets.toString() + "."
                + "\nFor total cost " + sumCost() + "$.";
    }
}
