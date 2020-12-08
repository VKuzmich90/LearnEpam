package epam.learn.module5.basicsOfOOP.Task1;
/**Создать объект класса Текстовый файл, используя классы Файл, Директория.
 Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class TextFile extends File {

    private Text content;

    public TextFile(Directory directory, String fileName) {
        super(directory, fileName);
        content = new Text("");
        super.getDirectory().addFile(this);
    }

    public void addText(String line) {
        content.addText(line);
    }

    public void printContent() {
        System.out.println(content.getText());
    }

    @Override
    public void changeName(String fileName) {
        this.setFileName(fileName);
    }
}
