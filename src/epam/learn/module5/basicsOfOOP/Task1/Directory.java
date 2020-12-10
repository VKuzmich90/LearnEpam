package epam.learn.module5.basicsOfOOP.Task1;
/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import java.util.ArrayList;

public class Directory {

    private String name;

    private ArrayList<File> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeDirectoryName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(String name) {

        for (int i = 0; i < files.size(); i++) {

            if (files.get(i).getName().equalsIgnoreCase(name)) {
                files.remove(i);
            }
        }
    }

    public void printContent(){
        System.out.println(name + ":");
        files.stream().forEach(System.out::println);
    }
 }
