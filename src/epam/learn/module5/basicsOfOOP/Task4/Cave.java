package epam.learn.module5.basicsOfOOP.Task4;

import epam.learn.module5.basicsOfOOP.Task4.Treasure.Treasure;
import epam.learn.module5.basicsOfOOP.Task4.Treasure.TreasureType;

import java.util.Arrays;

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

public class Cave {

    public Treasure[] treasures;

    public Cave(int treasureCount) {

        treasures = new Treasure[TreasureType.values().length];

        int treasureIndex = 0;

        for (TreasureType treasureType : TreasureType.values()) {
            int randomAmount;

            if (treasureIndex < TreasureType.values().length - 1) {
                randomAmount = (int) (Math.random() * treasureCount / 2);
            } else {
                randomAmount = treasureCount;
            }

            treasures[treasureIndex] = new Treasure(treasureType, randomAmount);
            treasureIndex++;
            treasureCount -= randomAmount;
        }
    }

    public void printCurrentTreasures() {

        System.out.println("Treasures:");
        int total = 0;

        for (Treasure treasure : treasures) {
            System.out.println(treasure);
            total += treasure.getPrice() * treasure.getAmount();
        }

        System.out.println("Total price: " + total);
    }

    public String getMostValuableTreasure() {
        int maxPrice = Integer.MIN_VALUE;
        int indexMax = 0;

        for (int i = 1; i < treasures.length; i++) {
            if (treasures[i].getPrice() > maxPrice && treasures[i].getAmount() > 0) {
                maxPrice = treasures[i].getPrice();
                indexMax = i;
            }
        }

        return "Got treasure: " + treasures[indexMax].getName();

    }

    public void getTreasureBySum(int value) {
        int copyOfValue = value;

        Treasure[] gotTreasures = new Treasure[treasures.length];

        Arrays.sort(treasures, (t1, t2) -> Integer.compare(t2.getPrice(), t1.getPrice()));

        for (int i = 0; i < treasures.length; i++) {
            int n = value / treasures[i].getPrice();

            while (n > treasures[i].getAmount()) {
                n--;
            }

            gotTreasures[i] = new Treasure(treasures[i], n);
            value -= n * treasures[i].getPrice();
        }

        if (value == 0) {
            System.out.println("Treasures by value: " + copyOfValue);

            Arrays.stream(gotTreasures).forEach(System.out::println);

        }
    }

}
