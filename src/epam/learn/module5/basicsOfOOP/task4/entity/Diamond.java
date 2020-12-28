package epam.learn.module5.basicsOfOOP.task4.entity;

public class Diamond extends Treasure {

    public Diamond(String name, int value, String descriptionOfTreasure) {
        super(name, value, descriptionOfTreasure);
    }

    @Override
    public String toString() {
        return String.format("%-5s %-25s value: %-5d description: %-10s", "Diamond:", super.getName(), super.getValue(), super.getDescriptionOfTreasure());
    }
}
