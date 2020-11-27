package epam.learn.module4.simpleClasses.Task6;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
времени на заданное количество часов, минут и секунд.
 */
public class RunTime {

    public static void main(String[] args) {

        Time time = new Time(17, 37, -6);
        WorkWithTime operation = new WorkWithTime();

        System.out.println(time.toString());

        time.setHour(10);
        System.out.println(time.toString());

        time.setMinute(22);
        System.out.println(time.toString());

        time.setSecond(38);
        System.out.println(time.toString());

        operation.changeHour(time,35);
        System.out.println(time.toString());

        operation.changeMinute(time,-245);
        System.out.println(time.toString());

        operation.changeSeconds(time,365);
        System.out.println(time.toString());
    }
}
