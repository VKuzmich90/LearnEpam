package epam.learn.module4.simpleClasses.Task6;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
времени на заданное количество часов, минут и секунд.
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    private void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    private void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    private void changeHour(int hour) {
        this.hour = (this.hour + hour) % 24;
        if (this.hour < 0) {
            this.hour += 24;
        }
    }

    private void changeMinute(int minute) {
        if (this.minute + minute >= 0) {                 // Возможно нужно будет перевести часы вперёд
            changeHour((this.minute + minute) / 60);
            this.minute = (this.minute + minute) % 60;
        } else {
            changeHour((this.minute + minute) / 60 - 1); // Переводим часы назад
            this.minute = 60 + (this.minute + minute) % 60;
        }
    }

    private void changeSeconds(int second) {
        if (this.second + second >= 0) {                 // Возможно нужно будет перевести минуты вперёд
            changeMinute((this.second + second) / 60);
            this.second = (this.second + second) % 60;
        } else {
            changeMinute((this.second + second) / 60 - 1); // Переводим минуты назад
            this.second = 60 + (this.second + second) % 60;
        }
    }

    private String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {

        Time time = new Time(17, 37, -6);
        System.out.println("Текущее время: " + time.getTime());

        time.setHour(10);
        System.out.println("Задали новое число часов: " + time.getTime());

        time.setMinute(22);
        System.out.println("Задали новое число минут: " + time.getTime());

        time.setSecond(38);
        System.out.println("Задали новое число секунд: " + time.getTime());

        time.changeHour(35);
        System.out.println("Изменили число на несколько часов: " + time.getTime());

        time.changeMinute(-245);
        System.out.println("Изменили число на несколько минут: " + time.getTime());

        time.changeSeconds(365);
        System.out.println("Изменили число на несколько секунд: " + time.getTime());
    }
}
