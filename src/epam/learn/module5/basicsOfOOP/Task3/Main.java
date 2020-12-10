package epam.learn.module5.basicsOfOOP.Task3;

import java.time.LocalDate;

/**Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
 информацию о выходных и праздничных днях.
 */


public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();

        calendar.addHolyday("holyday1", LocalDate.parse("2020-01-01"));
        calendar.addHolyday("holyday2", LocalDate.parse("2020-01-02"));
        calendar.addHolyday("holyday3", LocalDate.parse("2020-01-07"));
        calendar.addHolyday("holyday4", LocalDate.parse("2020-03-08"));
        calendar.addHolyday("holyday5", LocalDate.parse("2020-05-01"));
        calendar.addHolyday("holyday6", LocalDate.parse("2020-05-09"));
        calendar.addHolyday("holyday7", LocalDate.parse("2020-05-11"));
        calendar.addHolyday("holyday8", LocalDate.parse("2020-07-03"));
        calendar.addHolyday("holyday9", LocalDate.parse("2020-11-07"));
        calendar.addHolyday("holyday10", LocalDate.parse("2020-12-25"));


        calendar.printHolydaysInRange(LocalDate.parse("2020-03-01"), LocalDate.parse("2020-12-01"));


    }
}
