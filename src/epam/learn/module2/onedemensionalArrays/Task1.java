package epam.learn.module2.onedemensionalArrays;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/
public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[20];
        int number = 2;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (array[i] % number == 0) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
