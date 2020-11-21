package epam.learn.module4.simpleClasses.Task7;

import java.util.Locale;

/*Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {

    private Side sideA;
    private Side sideB;
    private Side sideC;

    private Triangle(Side a, Side b, Side c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    private static Triangle createTriangle(Point a, Point b, Point c) {
        Side sideA = new Side(a, b);
        Side sideB = new Side(b, c);
        Side sideC = new Side(a, c);
        return new Triangle(sideA, sideB, sideC);
    }

    private double getPerimeter(){
        return sideA.getLengthOfSide() + sideB.getLengthOfSide() + sideC.getLengthOfSide();
    }

    private double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA.getLengthOfSide()) * (p - sideB.getLengthOfSide()) * (p - sideC.getLengthOfSide()));
    }

    private Point mediansPoint() {
        double x = (sideA.getA().getX() + sideA.getB().getX() + sideB.getB().getX()) / 3;
        double y = (sideA.getA().getY() + sideA.getB().getY() + sideB.getB().getY()) / 3;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Point a = new Point(-1,-5);
        Point b = new Point(4,9);
        Point c = new Point(6,2);

        a.printCordinate();
        b.printCordinate();
        c.printCordinate();

        Triangle triangle = createTriangle(a, b, c);

        System.out.printf("Периметр: %.3f", triangle.getPerimeter());
        System.out.printf("\nПлощадь %.3f", triangle.getSquare());

        Point point = triangle.mediansPoint();
        System.out.printf("\nТочка пересечения медиан: ");
        point.printCordinate();

    }
}



