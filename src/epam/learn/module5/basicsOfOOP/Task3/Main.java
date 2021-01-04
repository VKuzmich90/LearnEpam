package epam.learn.module5.basicsOfOOP.Task3;

import java.time.LocalDate;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
 * информацию о праздничных днях.
 */


public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();

        calendar.addHoliday("1 января", LocalDate.parse("2020-01-01"));
        calendar.addHoliday("2 января", LocalDate.parse("2020-01-02"));
        calendar.addHoliday("Рождество православное", LocalDate.parse("2020-01-07"));
        calendar.addHoliday("8 марта", LocalDate.parse("2020-03-08"));
        calendar.addHoliday("1 мая", LocalDate.parse("2020-05-01"));
        calendar.addHoliday("9 мая", LocalDate.parse("2020-05-09"));
        calendar.addHoliday("Радуница", LocalDate.parse("2020-05-11"));
        calendar.addHoliday("День независимости", LocalDate.parse("2020-07-03"));
        calendar.addHoliday("7 ноября", LocalDate.parse("2020-11-07"));
        calendar.addHoliday("Рождество католическое", LocalDate.parse("2020-12-25"));


        calendar.printHolidaysInRange(LocalDate.parse("2020-03-01"), LocalDate.parse("2020-12-01"));
        calendar.deleteHoliday("7 ноября");
        calendar.printHolidaysInRange(LocalDate.parse("2020-03-01"), LocalDate.parse("2020-12-01"));

        System.out.println(calendar.getHolidaysSortByName());

    }
}
