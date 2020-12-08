package epam.learn.module4.simpleClasses.Task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
должны быть упорядочены по времени отправления.
 */

import java.text.ParseException;
import java.util.*;

import static epam.learn.module4.simpleClasses.Task4.Train.tf;
import static epam.learn.module4.simpleClasses.Task4.TrainUtil.printInformation;

public class Main {

    public static void main(String[] args) throws ParseException {

        List<Train> trains = getArrayOfTrains();

        //сортировка по номерам
        trains.sort(Comparator.comparing(Train::getNumber));
        System.out.println(trains.toString());

        // сортировка по пункту назначения, а затем по времени отправления
        trains.sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
        System.out.println(trains.toString());

        //Вывод информации о поезде по номеру
        printInformation(trains, 112);

    }

    public static List<Train> getArrayOfTrains() throws ParseException {
        List<Train> trains = new ArrayList<>();

        trains.add(new Train("Минск", 570, tf.parse("11:12")));
        trains.add(new Train("Витебск", 563, tf.parse("12:43")));
        trains.add(new Train("Брест", 310, tf.parse("02:17")));
        trains.add(new Train("Гомель", 112, tf.parse("15:49")));
        trains.add(new Train("Брест", 711, tf.parse("09:23")));

        return trains;
    }
}


