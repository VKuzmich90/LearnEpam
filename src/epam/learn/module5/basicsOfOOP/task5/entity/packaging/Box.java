package epam.learn.module5.basicsOfOOP.task5.entity.packaging;

public class Box {

    private BoxMaterial material;
    private BoxColour colour;

    public Box(BoxMaterial material, BoxColour color) {
        this.material = material;
        this.colour = color;
    }

    public BoxMaterial getBoxMaterial() {
        return material;
    }

    public void setBoxMaterial(BoxMaterial material) {
        this.material = material;
    }

    public BoxColour getColour() {
        return colour;
    }

    public void setColour(BoxColour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Packing: material - " + material + ", colour - " + colour + ".";
    }
}
