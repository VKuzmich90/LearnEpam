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

    public void printDayOfWeek(AirlineBase list, DayOfWeek[] dates) {
        System.out.println("Список вылетов в определённый день");

        ArrayList<Airline> airlinesOnDay = list.flightDays(dates[]);

        for (Airline airline : airlinesOnDay) {
            System.out.println(airline);
        }
    }

    public void printDayofWeekAndTime(AirlineBase list, DayOfWeek[] dayOfWeeks, Date time) throws ParseException {
        System.out.printf("\n Список вылетов в %d, после ", dayOfWeeks, time);

        //  Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnDay = list.flightDays(DayOfWeek.MONDAY, time);

        for (Airline airline : airlinesOnDay) {
            System.out.println(airline);
        }
    }
}