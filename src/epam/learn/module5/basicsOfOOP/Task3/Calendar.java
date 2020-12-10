package epam.learn.module5.basicsOfOOP.Task3;

/**Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.
 */

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Calendar {

    private final List<Holiday> holydays = new ArrayList<>();

    public Calendar() {
    }

    private static class Holiday {
        String title;
        LocalDate date;

        public Holiday(String title, LocalDate date) {
            this.title = title;
            this.date = date;
        }

        public LocalDate getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "title='" + title + '\'' +
                    ", date=" + date +
                    '}';
        }


    }

    public void addHolyday(String title, LocalDate date) {
        holydays.add(new Holiday(title, date));
    }

    public void printHolydaysInRange(LocalDate fromDate, LocalDate toDate) {
        System.out.println("Holydays in range: from " + fromDate + ", to " + toDate);
        holydays.stream().filter(o -> o.date.isAfter(fromDate) && o.date.isBefore(toDate)).forEach(System.out::println);
    }
}
