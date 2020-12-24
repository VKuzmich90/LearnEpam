package epam.learn.module5.basicsOfOOP.task5.entity.packaging;

public enum BoxMaterial {
    CARDBOARD("cardboard"),
    WOOD("wood"),
    METALL("metall");

    BoxMaterial(String name) {
        this.name = name;
    }

    public String name;

    public static BoxMaterial fromStringTypeBoxMaterial(String value) {

        for (BoxMaterial typeBoxMaterial : BoxMaterial.values()) {

            if (typeBoxMaterial.name.equals(value)) {

                return typeBoxMaterial;
            }
        }
        throw new IllegalArgumentException("Unknown packaging");
    }
}
