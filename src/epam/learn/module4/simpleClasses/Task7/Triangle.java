package epam.learn.module4.simpleClasses.Task7;

/*Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;


    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }


    //длина стороны треугольника
    public double getLengthOfSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }


    //периметр треугольника
    public double getPerimeter() {
        return getLengthOfSide(x1, y1, x2, y2) + getLengthOfSide(x2, y2, x3, y3) + getLengthOfSide(x3, y3, x1, y1);
    }


    //площадь треугольника
    public double getSquare() {
        double p = getPerimeter() / 2; //считаем полупериметр

        // находим площадь по формуле Герона
        return Math.sqrt(p * (p - getLengthOfSide(x1, y1, x2, y2)) * (p - getLengthOfSide(x2, y2, x3, y3)) *
                (p - getLengthOfSide(x3, y3, x1, y1)));
    }


    //точка пересечения медиан
    public double[] centerOfMedians() {
        double x = (x1 + x2 + x3) / 3;
        double y = (y1 + y2 + y3) / 3;

        double[] point = {x, y};

        return point;
    }

}



