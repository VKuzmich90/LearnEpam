package epam.learn.module2.onedemensionalArrays;

public class Task7 {

    public static void main(String[] args) {
        double[] array = {1, 5, 8, -6, -4, 9, 3, 5, 0, 4};
        double maxSum = array[0] + array[array.length - 1];

        for (int i = 0; i < array.length / 2; i++) {
            if (maxSum < array[i] + array[array.length - 1 - i]) {
                maxSum = array[i] + array[array.length - 1 - i];
            }
        }
        System.out.println(maxSum);
    }
}
