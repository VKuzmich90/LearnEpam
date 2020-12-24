package epam.learn.module5.basicsOfOOP.task5.entity.packaging;

public enum BoxColour {
    RED("red"),
    GREEN("green"),
    WHITE("white"),
    BLUE("blue"),
    YELLOW("yellow");

    public String name;

    BoxColour(String name) {
        this.name = name;
    }


    public static BoxColour fromString(String value) {

        for (BoxColour colour : BoxColour.values()) {

            if (colour.name.equals(value)) {

                return colour;
            }
        }
        throw new IllegalArgumentException("Unknown colour");
    }
}
