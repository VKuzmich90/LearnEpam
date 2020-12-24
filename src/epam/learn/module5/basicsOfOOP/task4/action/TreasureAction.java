package epam.learn.module5.basicsOfOOP.task4.action;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * <p>
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */


import epam.learn.module5.basicsOfOOP.task4.entity.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureAction {

    public static Cave smaugCave = new Cave("Smaug cave");

    public void showAllTreasure() {
        smaugCave.setNumberOfTreasure(100);
        smaugCave.getTreasures().forEach(System.out::println);
    }

    public Treasure chooseMostExpensive() {
        smaugCave.setNumberOfTreasure(100);
        int highestPrice = 0;
        Treasure mostExpensiveTreasure = null;

        for (Treasure element : smaugCave.getTreasures()) {

            if (element.getValue() > highestPrice) {
                highestPrice = element.getValue();
                mostExpensiveTreasure = element;
            }
        }

        return mostExpensiveTreasure;
    }

    public void selectForGivenAmount(int[] valueRange) {
        List<Treasure> treasures = new ArrayList<>();

        for (Treasure element : smaugCave.getTreasures()) {

            if (element.getValue() >= valueRange[0] && element.getValue() <= valueRange[1]) {
                treasures.add(element);
            }
        }

        if (treasures.size() == 0) {
            System.out.println("No options found.\n");
            return;
        }

        int id = 1;
        treasures.forEach(System.out::println);
    }

    public List<Treasure> fillCaveWithTreasures(int numberOfTreasure) {

        List<Treasure> treasures = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("src/epam/learn/module5/basicsOfOOP/task4/data/treasures_list.txt");

            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine() && numberOfTreasure-- > 0) {

                String[] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];

                int treasureValue = Integer.parseInt(treasureLine[2]);

                String descriptionOfTreasure = treasureLine[3];

                switch (treasureType) {

                    case "Amethyst":
                        treasures.add(new Amethyst(treasureName, treasureValue, descriptionOfTreasure));
                        break;

                    case "Emerald":
                        treasures.add(new Emerald(treasureName, treasureValue, descriptionOfTreasure));
                        break;

                    case "Ruby":
                        treasures.add(new Ruby(treasureName, treasureValue, descriptionOfTreasure));
                        break;

                    case "Coin":
                        treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
                        break;

                    case "Diamond":
                        treasures.add(new Diamond(treasureName, treasureValue, descriptionOfTreasure));
                        break;

                    case "Topaz":
                        treasures.add(new Topaz(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Treasure information file not found.");
        }

        return treasures;
    }

}
