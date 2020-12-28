package epam.learn.module5.basicsOfOOP.task4.entity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cave {

    private String name;

    private int numberOfTreasure;

    private List<Treasure> treasures = fillCaveWithTreasures(100);


    public Cave(String name) {
        this.name = name;
        this.numberOfTreasure = 100;
    }

    public void showAllTreasure() {
        treasures.forEach(System.out::println);
    }

    public Treasure chooseMostExpensive() {

        int highestPrice = 0;
        Treasure mostExpensiveTreasure = null;

        for (Treasure element : treasures) {

            if (element.getValue() > highestPrice) {
                highestPrice = element.getValue();
                mostExpensiveTreasure = element;
            }
        }

        return mostExpensiveTreasure;
    }

    public void selectForGivenAmount(int[] valueRange) {
        List<Treasure> treasures2 = new ArrayList<>();

        for (Treasure element : treasures) {

            if (element.getValue() >= valueRange[0] && element.getValue() <= valueRange[1]) {
                treasures2.add(element);
            }
        }

        if (treasures2.size() == 0) {
            System.out.println("No options found.\n");
            return;
        }

        int id = 1;
        treasures2.forEach(System.out::println);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTreasure() {
        return numberOfTreasure;
    }

    public void setNumberOfTreasure(int numberOfTreasure) {
        this.numberOfTreasure = numberOfTreasure;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }
}
