package epam.learn.module4.simpleClasses.Task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
должны быть упорядочены по времени отправления.
 */

import java.text.ParseException;
import static epam.learn.module4.simpleClasses.Task4.Train.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Train[] trains = new Train[5];
        trains[0] = new Train("Минск", 570, tf.parse("11:12"));
        trains[1] = new Train("Витебск", 563, tf.parse("12:43"));
        trains[2] = new Train("Брест", 310, tf.parse("02:17"));
        trains[3] = new Train("Гомель", 112, tf.parse("15:49"));
        trains[4] = new Train("Брест", 711, tf.parse("09:23"));


        printInformation(trains, 112);

        sortTrainNumber(trains);
        for (Train train : trains) {
            System.out.println(train.number);
        }

        sortDestination(trains);
        for (Train train : trains) {
            System.out.println(train.destination + " " + train.number + " " + tf.format(train.departureTime));
        }
    }
}

