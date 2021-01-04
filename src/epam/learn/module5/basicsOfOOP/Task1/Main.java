package epam.learn.module5.basicsOfOOP.Task1;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

    public static void main(String[] args) {

        Directory package1 = new Directory("Package_1");
        Directory package2 = new Directory("Package_2", package1);
        Directory package3 = new Directory("Package_3", package1);
        Directory package4 = new Directory("Package_4", package3);

        TextFile textFile1 = new TextFile("textFile1.txt", package1);
        TextFile textFile6 = new TextFile("textFile6.txt", package2);

        String line1 = "Мистер Джонс, хозяин Господского Двора, запер на ночь курятник.";
        textFile1.addText(line1);
        textFile1.printText();

        File textFile2 = new TextFile("textFile0.txt", package1);
        textFile2.setName("textFile2.txt");

        File textFile3 = new TextFile("textFile3.txt", package1);

        package1.removeElement("textFile1.txt");

        package1.printContent();

    }
}



