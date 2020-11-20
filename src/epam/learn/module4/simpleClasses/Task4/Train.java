package epam.learn.module4.simpleClasses.Task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
должны быть упорядочены по времени отправления.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

    private String destination;
    private int number;
    private Date departureTime;

    private static SimpleDateFormat tf = new SimpleDateFormat("HH:MM");

    public Train(String destination, int number, Date departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    private static void sortTrainNumber(Train[] trains)  {
        int copy = Integer.MAX_VALUE;

        for (int i = trains.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (trains[j].number > trains[j + 1].number ) {
                    copy = trains[j].number;
                    trains[j].number = trains[j + 1].number;
                    trains[j + 1].number = copy;

                }
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Train [] trains = new Train[5];
        trains[0] = new Train("Минск", 570, tf.parse("18:58"));
        trains[1] = new Train("Витебск", 563, tf.parse("11:48"));
        trains[2] = new Train("Брест", 310, tf.parse("13:50"));
        trains[3] = new Train("Гомель", 112, tf.parse("15:40"));
        trains[4] = new Train("Брест", 711, tf.parse("05:40"));

        sortTrainNumber(trains);
        for (Train train: trains) {
            System.out.println(train.number);
            
        }
    }
}
