package epam.learn.module4.simpleClasses.Task7;

/*Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

    public static void main(String[] args) {

        Point a = new Point(-1, -5);
        Point b = new Point(4, 9);
        Point c = new Point(6, 2);

        Triangle triangle = new Triangle();

        System.out.printf("Периметр: %.3f", triangle.getPerimeter(a, b, c));

        System.out.printf("\nПлощадь %.3f", triangle.getSquare(a, b, c));

        Point point = triangle.centerOfMedians(a, b, c);

        System.out.printf("\nТочка пересечения мередиан: " + point.toString());
    }

}
