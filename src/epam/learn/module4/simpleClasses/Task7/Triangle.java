package epam.learn.module4.simpleClasses.Task7;

import java.util.Locale;

/*Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //длина стороны треугольника
    public double getLengthOfSide(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }


    //периметр треугольника
    public double getPerimeter(Point a, Point b, Point c) {
        return getLengthOfSide(a, b) + getLengthOfSide(b, c) + getLengthOfSide(c, a);
    }


    //площадь треугольника
    public double getSquare(Point a, Point b, Point c) {
        double p = getPerimeter(a, b, c) / 2; //считаем полупериметр

        // находим площадь по формуле Герона
        return Math.sqrt(p * (p - getLengthOfSide(a, b)) * (p - getLengthOfSide(b, c)) * (p - getLengthOfSide(c, a)));
    }


    //точка пересечения медиан
    public Point centerOfMedians(Point a, Point b, Point c) {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;

        return new Point(x, y);
    }


}



