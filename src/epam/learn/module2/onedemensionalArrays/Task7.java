package epam.learn.module2.onedemensionalArrays;

public class Task7 {

    public static void main(String[] args) {
        double[] array = {1, 5, 8, -6, -4, 9, 3, 5, 0, 4};
        double maxSum = array[0] + array[array.length - 1];
        double sum = 0;

        for (int i = 1; i < array.length / 2; i++) {
            sum = array[i] + array[array.length - 1 - i];
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
