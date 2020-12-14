package epam.learn.module5.basicsOfOOP.Task4;

import java.util.Scanner;

public class Menu {

    private final static int TREASURE_COUNT = 100;

    private static boolean doRun = true;

    private static Cave cave;

    public static void main(String[] args) {

        cave = new Cave(TREASURE_COUNT);

        while (doRun) {
            int code;

            printMainMenu();
            code = getCode();

            switch (code) {
                case 0:
                    exitHandler();
                    break;

                case 1:
                    viewTreasuresHandler();
                    break;

                case 2:
                    getMostValuableTreasureHandler();
                    break;

                case 3:
                    getTreasureBySumHandler();
                    break;

                default:
                    wrongMainMenuInputHandler();
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("------------------\nMenu:");
        System.out.println("1 - view treasures");
        System.out.println("2 - get most valuable treasure");
        System.out.println("3 - get treasures by sum");
        System.out.println("0 - exit");
    }

    private static int getCode() {
        int code = -1;

        try {
            Scanner scanner = new Scanner(System.in);
            code = scanner.nextInt();

        } catch (Exception e) {
            wrongInputHandler();
        }

        return code;
    }

    private static void exitHandler() {
        doRun = false;
    }

    private static void viewTreasuresHandler() {
        if (cave != null) {
            cave.printCurrentTreasures();
        }
    }

    private static void getMostValuableTreasureHandler() {

        System.out.println(cave.getMostValuableTreasure());
    }

    private static void getTreasureBySumHandler() {
        int value;

        while (true) {
            System.out.println("Input value (> 0):");

            try {
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextInt();

                if (value < 1) {
                    throw new Exception();
                }
                break;

            } catch (Exception e) {
                wrongInputHandler();
            }
        }

        cave.getTreasureBySum(value);
    }

    private static void wrongMainMenuInputHandler() {
        System.out.println("Wrong input, try harder!");
    }

    private static void wrongInputHandler() {
        System.out.println("Wrong input!");
    }
}
