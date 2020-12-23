package epam.learn.module5.basicsOfOOP.task4.entity;

public class Topaz extends Treasure{

    private String descriptionOfTreasure;

    public Topaz(String name, int value, String descriptionOfTreasure) {
        super.setName(name);
        super.setValue(value);
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    @Override
    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-25s value: %-5d description: %-10s", "Topaz:", super.getName(), super.getValue(),descriptionOfTreasure);
    }
}
