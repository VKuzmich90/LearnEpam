package epam.learn.module2.decompositionUsingMethods;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
public class Task9 {

    public static void main(String[] args) {
    double x = 5;
    double y = 6;
    double z = 4;
    double t = 7;

    getSquareRectangle(x, y, z, t);

    }

    private static double getSquareRectangle(double x, double y, double z, double t) {
        double max = Math.max(Math.max(x,y),Math.max(z,t));
        double square = 0;
        if ( max < x + y + z + t - max) {
            double xy = Math.sqrt(x * x + y * y);
            double p = (xy + z + t) / 2;
            square = x * y * 0.5 + Math.sqrt(p * (p - xy) * (p - z) * (p - t));
            System.out.println("Площадь четырёхугольника равна: " + square);
        } else {
            System.out.println("Такого четырёхугольника не существует");
        }
        return square;
    }
}
