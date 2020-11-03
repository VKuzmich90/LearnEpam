package epam.learn.module2.decompositionUsingMethods;

/*На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task4 {

    public static void main(String[] args) {
        double[][] array = new double[2][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.random() * 20;
            }
        }
        maxDistance(array);

    }

    private static double maxDistance(double[][] array) {
        double maxDistace = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (maxDistace < distance(array[i - 1][j - 1], array[i][j - 1], array[i - 1][j], array[i][j])) {
                    maxDistace = distance(array[i - 1][j - 1], array[i][j - 1], array[i - 1][j], array[i][j]);
                }
            }

        }
        System.out.println(maxDistace);
        return maxDistace;
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }


}
