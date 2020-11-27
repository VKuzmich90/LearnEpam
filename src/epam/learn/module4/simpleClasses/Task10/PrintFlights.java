package epam.learn.module4.simpleClasses.Task10;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;

public class PrintFlights {

    public void printDestination(AirlineBase list, String destination) {
        System.out.println("Список вылетов в " + destination);

        ArrayList<Airline> airlinesToBrussels = list.airlinesToDestination(destination);

        for (Airline airline : airlinesToBrussels) {
            System.out.println(airline);
        }
    }

    public void printDayOfWeek(AirlineBase list, DayOfWeek dayOfWeek) {
        System.out.println("Список вылетов в " + dayOfWeek);

        ArrayList<Airline> airlinesOnDay = list.flightDays(dayOfWeek);

        for (Airline airline : airlinesOnDay) {
            System.out.println(airline);
        }
    }

    public void printDayofWeekAndTime(AirlineBase list, DayOfWeek dayOfWeeks, Date time) throws ParseException {
        System.out.printf("\n Список вылетов в %d, после ", dayOfWeeks, time);


        ArrayList<Airline> airlinesOnDay = list.flightDays(DayOfWeek.MONDAY, time);

        for (Airline airline : airlinesOnDay) {
            System.out.println(airline);
        }
    }
}