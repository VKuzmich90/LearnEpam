package epam.learn.module1.branching;

public class Task4 {

    public static void main(String[] args) {
        double lenghtHole = 4;
        double widthHole = 3;
        double lenghtBrick = 5.5;
        double widthBrick = 3;
        double heightBrick = 3.5;
        double minSize;
        double middleSize;

        if (lenghtBrick <= widthBrick && lenghtBrick <= heightBrick) {
            minSize = lenghtBrick;
            middleSize = widthBrick <= heightBrick ? widthBrick : heightBrick;
        } else if (widthBrick <= lenghtBrick && widthBrick <= heightBrick) {
            minSize = widthBrick;
            middleSize = lenghtBrick <= heightBrick ? lenghtBrick : heightBrick;
        } else {
            minSize = heightBrick;
            middleSize = lenghtBrick <= widthBrick ? lenghtBrick : widthBrick;
        }

        if (lenghtHole <= widthHole) {
            printResult(minSize <= lenghtHole && middleSize <= widthHole);
        } else {
            printResult(minSize <= widthHole && middleSize <= lenghtHole);
        }
    }

    static void printResult(boolean result) {
        if (result == true) {
            System.out.println("The brick will go through the hole");
        } else {
            System.out.println("The brick will not go through the hole");
        }
    }

}
