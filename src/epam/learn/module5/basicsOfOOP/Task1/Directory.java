package epam.learn.module5.basicsOfOOP.Task1;
/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import java.util.LinkedList;
import java.util.List;

public class Directory extends Element {

    private List<Element> elementList = new LinkedList<>();

    public Directory(String name, Directory directory) {
        super(name, directory);
        getDirectory().addElement(this);
    }

    public Directory(String name) {
        super(name);
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    public void addElement(Element element) {
        this.elementList.add(element);
    }

    public void removeElement(String name) {
        for (Element element : elementList) {

            if (element.getName().equalsIgnoreCase(name)) {
                elementList.remove(element);
                break;
            }
        }
    }

        public void printContent() {
        System.out.println(getName() + ":");
        elementList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name=" + getName() + " " + elementList +
                '}';
    }
}
