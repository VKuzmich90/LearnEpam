package epam.learn.module4.simpleClasses.Task7;

/*Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Point {

    private double x;
    private double y;

    public void printCordinate() {
        System.out.println("(" + getX() + ", " + getY() + ")");
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
