package epam.learn.module5.basicsOfOOP.Task1;
/**Создать объект класса Текстовый файл, используя классы Файл, Директория.
 Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class TextFile extends File {

    private String text;

    public TextFile(Directory directory, String name) {
        super(directory, name);
        text = "";
        super.getDirectory().addFile(this);
    }

    public TextFile(String name) {
        super(name);
    }

    public void addText(String line) {
        text += line;
    }

    public void printText() {
        System.out.println(text);
    }

}
