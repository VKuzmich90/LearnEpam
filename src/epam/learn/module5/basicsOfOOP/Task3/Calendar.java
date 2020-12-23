package epam.learn.module5.basicsOfOOP.Task3;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
 * информацию о праздничных днях.
 */

import java.time.LocalDate;
import java.util.*;

public class Calendar {

    private final List<Holiday> holidays = new ArrayList<>();

    public class Holiday {
        String name;
        LocalDate date;

        public Holiday(String name, LocalDate date) {
            this.name = name;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "name='" + name + '\'' +
                    ", date=" + date +
                    '}';
        }
    }

    public void addHoliday(String name, LocalDate date) {
        holidays.add(new Holiday(name, date));
    }

    public void deleteHoliday(String name) {
        for (Holiday holiday : holidays) {

            if (holiday.getName().equalsIgnoreCase(name)) {
                holidays.remove(holiday);
                break;
            }
        }
    }

    public void sortByName() {
        holidays.sort(Comparator.comparing(Holiday::getName));
    }

    public void sortByDate() {
        holidays.sort(Comparator.comparing(Holiday::getDate));
    }

    public void printHolidaysInRange(LocalDate fromDate, LocalDate toDate) {
        System.out.println("\nHolidays in range: from " + fromDate + ", to " + toDate);
        holidays.stream().filter(o -> o.date.isAfter(fromDate) && o.date.isBefore(toDate)).forEach(System.out::println);
    }

    public void printAllHolidays() {
        System.out.println();
        holidays.forEach(System.out::println);
    }
}
