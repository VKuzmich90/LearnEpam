package epam.learn.module5.basicsOfOOP.Task1;

public abstract class Element {

    private String name;

    private Directory directory;

    public Element(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
    }

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "File {" +
                "name='" + name +
                '}';
    }
}
