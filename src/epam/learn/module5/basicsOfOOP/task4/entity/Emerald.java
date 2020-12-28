package epam.learn.module5.basicsOfOOP.task4.entity;

public class Emerald extends Treasure {

    public Emerald(String name, int value, String descriptionOfTreasure) {
        super(name, value, descriptionOfTreasure);
    }

    @Override
    public String toString() {
        return String.format("%-5s %-25s value: %-5d description: %-10s", "Emerald:", super.getName(), super.getValue(), super.getDescriptionOfTreasure());
    }
}
