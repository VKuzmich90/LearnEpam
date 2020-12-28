package epam.learn.module5.basicsOfOOP.Task1;
/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import java.util.ArrayList;
import java.util.List;

public class Directory extends Element{

    private List<File> fileList = new ArrayList<>();

    private List<Directory> directoryList = new ArrayList<>();

    public Directory(String name, Directory directory) {
        super(name, directory);
        getDirectory().addDirectory(this);
    }

    public Directory(String name) {
        super(name);
    }

    public List<Directory> getDirectoryList() {
        return directoryList;
    }

    public void setDirectoryList(List<Directory> directoryList) {
        this.directoryList = directoryList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public void addDirectory(Directory directory) {
        this.directoryList.add(directory);
    }

    public void removeDirectory(String name) {

        for (int i = 0; i < directoryList.size(); i++) {

            if (directoryList.get(i).getName().equalsIgnoreCase(name)) {
                directoryList.remove(i);
            }
        }
    }

    public void addFile(File file) {
        this.fileList.add(file);
    }

    public void removeFile(String name) {

        for (int i = 0; i < fileList.size(); i++) {

            if (fileList.get(i).getName().equalsIgnoreCase(name)) {
                fileList.remove(i);
            }
        }
    }

    public void printContent() {
        System.out.println(getName() + ":");
        directoryList.forEach(System.out::println);
        fileList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + getName() + '\'' +
                ", fileList=" + fileList +
                ", directoryList=" + directoryList +
                '}';
    }
}
