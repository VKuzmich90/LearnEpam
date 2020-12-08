package epam.learn.module5.basicsOfOOP.Task1;

public class Main {

    public static void main(String[] args) {

        Directory directory = new Directory("Книги");

        String fileName = "Скотный двор";

        TextFile tFile = new TextFile(directory, fileName);

        String line1 = "Мистер Джонс, хозяин Господского Двора, запер на ночь курятник, но про лазы для молодняка спьяну забыл.";

        tFile.addText(line1);

        System.out.println("Создали текстовый файл: \"" + tFile.getFileName() + "\"");

        tFile.changeName("Скотный двор Оруэлл");
        System.out.println("Поменяли название текстового файла на: \"" + tFile.getFileName() + "\"");

        System.out.println("\nПечатаем содержимое файла");
        tFile.printContent();

        System.out.println("\nДополняем файл и печатаем содержимое");
        String line2 = "Фонарь в его руке ходил ходуном, круг света метался из стороны в сторону, когда он, выписывая " +
                "вензеля, прошел к черному ходу, скинул сапоги, нацедил в кладовке свою последнюю в этот день кружку пива из бочки и залез в кровать, где уже задавала храпака миссис Джонс.";
        tFile.addText(line2);
        tFile.printContent();

        System.out.println("\nВыводим содержимое директории");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nСоздаём новый текстовый файл");
        File tFile2 = new TextFile(directory, "1984");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nУдаляем один текстовый файл и выводим содержимое директории");
        directory.removeFile("Скотный двор Оруэлл");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}



