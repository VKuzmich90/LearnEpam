package epam.learn.module4.aggregationAndComposition.Task2;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel {

    private boolean isGoodWheel;

    public Wheel(boolean isGood) {
        this.isGoodWheel = true;
    }


    public boolean isGoodWheel() {
        return isGoodWheel;
    }

    public void setGoodWheel(boolean goodWheel) {
        isGoodWheel = goodWheel;
    }

    public void breakWheel() {
        this.isGoodWheel = false;
    }
}
