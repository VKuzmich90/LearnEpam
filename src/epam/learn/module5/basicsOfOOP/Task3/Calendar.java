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

    public List<Holiday> sortByName() {
        List<Holiday> holidays2 = new ArrayList<>(holidays);
        holidays2.sort(Comparator.comparing(Holiday::getName));
        return holidays2;
    }

    public List<Holiday> sortByDate() {
        List<Holiday> holidays2 = new ArrayList<>(holidays);
        holidays2.sort(Comparator.comparing(Holiday::getDate));
        return holidays2;
    }

    public void printHolidaysInRange(LocalDate fromDate, LocalDate toDate) {
        holidays.stream().filter(o -> o.date.isAfter(fromDate) && o.date.isBefore(toDate)).forEach(System.out::println);
    }

    public void printAllHolidays() {
        System.out.println();
        holidays.forEach(System.out::println);
    }
}
