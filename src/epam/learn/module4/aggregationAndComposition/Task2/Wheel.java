package epam.learn.module4.aggregationAndComposition.Task2;
/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel {

    private int diameter;

    private boolean isGoodWheel;

    public Wheel(int diameter, boolean isGood) {
        this.diameter = diameter;
        this.isGoodWheel = true;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
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
