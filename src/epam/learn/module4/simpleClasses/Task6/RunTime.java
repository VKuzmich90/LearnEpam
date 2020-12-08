package epam.learn.module4.simpleClasses.Task6;

import static epam.learn.module4.simpleClasses.Task6.WorkWithTime.*;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
времени на заданное количество часов, минут и секунд.
 */
public class RunTime {

    public static void main(String[] args) {

        Time time = new Time(17, 37, -6);
        System.out.println(time.toString());

        time.setHour(10);
        System.out.println(time.toString());

        time.setMinute(22);
        System.out.println(time.toString());

        time.setSecond(38);
        System.out.println(time.toString());

        changeHour(time,35);
        System.out.println(time.toString());

        changeMinute(time,-245);
        System.out.println(time.toString());

        changeSeconds(time,365);
        System.out.println(time.toString());
    }
}
