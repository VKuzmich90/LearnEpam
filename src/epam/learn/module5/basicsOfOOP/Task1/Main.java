package epam.learn.module5.basicsOfOOP.Task1;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

    public static void main(String[] args) {

        Directory package1 = new Directory("Package_1");
        Directory package2 = new Directory(package1, "Package_2");
        Directory package3 = new Directory(package1, "Package_3");

        TextFile textFile1 = new TextFile(package1, "textFile1.txt");
        TextFile textFile6 = new TextFile(package2, "textFile6.txt");

        String line1 = "Мистер Джонс, хозяин Господского Двора, запер на ночь курятник.";
        textFile1.addText(line1);
        textFile1.printText();

        File textFile2 = new TextFile(package1,"textFile0.txt");
        textFile2.setName("textFile2.txt");

        File textFile3 = new TextFile(package1, "textFile3.txt");

        package1.removeFile("textFile1.txt");

        package1.printContent();

    }
}



