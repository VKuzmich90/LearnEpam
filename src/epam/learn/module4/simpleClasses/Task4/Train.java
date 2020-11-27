package epam.learn.module4.simpleClasses.Task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
должны быть упорядочены по времени отправления.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Train {
    private String destination;
    private int number;
    private Date departureTime;
    public static SimpleDateFormat tf = new SimpleDateFormat("HH:mm");


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public SimpleDateFormat getTf() {
        return tf;
    }

    public void setTf(SimpleDateFormat tf) {
        Train.tf = tf;
    }


    public Train(String destination, int number, Date departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }


    @Override
    public String toString() {
        return destination + " " + number + " " + tf.format(departureTime);
    }

//    @Override
//    public int compareTo(Train o) {
//        int result = this.destination.compareTo(o.destination);
//
//        if (result == 0) {
//            result = this.departureTime.compareTo(o.departureTime);
//        }
//
//        return result;
//    }


    public static void printInformation(List<Train> trains, int number) {
        for (Train train: trains) {
            if (number == train.number) {
                System.out.println(train.toString());
            }
        }
    }
}