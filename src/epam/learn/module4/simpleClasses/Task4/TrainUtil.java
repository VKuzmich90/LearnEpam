package epam.learn.module4.simpleClasses.Task4;

import java.util.List;

public final class TrainUtil {

    public static void printInformation(List<Train> trains, int number) {
        for (Train train: trains) {
            if (number == train.getNumber()) {
                System.out.println(train.toString());
            }
        }
    }
}
