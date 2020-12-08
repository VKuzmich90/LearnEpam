package epam.learn.module4.simpleClasses.Task6;
/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
времени на заданное количество часов, минут и секунд.
 */

public final class WorkWithTime {

    public static Time changeHour(Time time, int hour) {
        int result;

        result = (time.getHour() + hour) % 24;
        if (time.getHour() < 0) {
             result += 24;
        }
        time.setHour(result);
        return time;
    }

    public static Time changeMinute(Time time, int minute) {
        int result;

        if (time.getMinute() + minute >= 0) {                 // Возможно нужно будет перевести часы вперёд
            changeHour(time, (time.getMinute() + minute) / 60);
            result = (time.getMinute() + minute) % 60;
        } else {
            changeHour(time, (time.getHour() + minute) / 60 - 1); // Переводим часы назад
            result = 60 + (time.getMinute() + minute) % 60;
        }

        time.setMinute(result);
        return time;
    }

    public static Time changeSeconds(Time time, int second) {
        int result;

        if (time.getSecond() + second >= 0) {                 // Возможно нужно будет перевести минуты вперёд
            changeMinute(time, (time.getSecond() + second) / 60);
            result = (time.getSecond() + second) % 60;
        } else {
            changeMinute(time,(time.getSecond() + second) / 60 - 1); // Переводим минуты назад
            result = 60 + (time.getSecond() + second) % 60;
        }

        time.setSecond(result);
        return time;
    }
}
