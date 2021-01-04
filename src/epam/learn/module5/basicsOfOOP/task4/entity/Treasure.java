package epam.learn.module5.basicsOfOOP.task4.entity;

public abstract class Treasure {

    private String name;

    private Integer value;

    private String descriptionOfTreasure;

    public Treasure(String name, Integer value, String descriptionOfTreasure) {
        this.name = name;
        this.value = value;
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public abstract String toString();

}
