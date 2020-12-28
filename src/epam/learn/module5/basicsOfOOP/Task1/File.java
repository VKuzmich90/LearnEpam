package epam.learn.module5.basicsOfOOP.Task1;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class File extends Element{

    public File(String name, Directory directory) {
        super(name, directory);
    }

    public File(String name) {
        super(name);
    }

}

