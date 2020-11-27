package epam.learn.module4.simpleClasses.Task10;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        AirlineBase flights = getBase();

        PrintFlights fly = new PrintFlights();

        fly.printDestination(flights, "Moscow");

        fly.printDayOfWeek(flights, DayOfWeek.WEDNESDAY);

    }

    public static AirlineBase getBase() throws ParseException {
        AirlineBase flights = new AirlineBase("Minsk (MSQ)", new ArrayList<>());

        flights.addAirline("Berlin", "B2 891", "Embraer RJ-175",
                Airline.ft.parse("11:00"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});

        flights.addAirline("Moscow", "B2 993", "Boeing 737-500",
                Airline.ft.parse("19:00"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                        DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});

        flights.addAirline("Moscow", "SU 1833", "Sukhoi Superjet 100-95",
                Airline.ft.parse("11:00"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});

        flights.addAirline("Berlin", "B2 817", "Embraer 175",
                Airline.ft.parse("8:40"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});

        flights.addAirline("Paris", "B2 855", "Embraer 195",
                Airline.ft.parse("14:55"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});


        return flights;
    }

}
