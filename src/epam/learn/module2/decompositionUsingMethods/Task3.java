package epam.learn.module2.decompositionUsingMethods;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника
 */
public class Task3 {

    public static void main(String[] args) {
        int a = 4;
        double square = squareTriangle(a) * 6;
        System.out.printf("Площадь правильного шестеугольника равна: %.3f", square);
    }

    private static double squareTriangle(int a) {
        return Math.sqrt(3) / 4 * a * a;
    }
}

