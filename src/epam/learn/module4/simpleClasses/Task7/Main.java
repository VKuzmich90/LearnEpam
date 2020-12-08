package epam.learn.module4.simpleClasses.Task7;

/*Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Triangle triangle = new Triangle(-1, -5, 4, 9, 6, 2);

        System.out.printf("Периметр: %.3f", triangle.getPerimeter());

        System.out.printf("\nПлощадь %.3f", triangle.getSquare());

        System.out.printf("\nТочка пересечения мередиан: " + Arrays.toString(triangle.centerOfMedians()));
    }

}
