package epam.learn.module1.cycles;

import java.math.BigDecimal;

public class Task4 {

    public static void main(String[] args) {
        int[] array = new int[200];
        BigDecimal result = BigDecimal.ONE;

        for (int i = 1; i <= array.length; i++) {
            result = result.multiply(BigDecimal.valueOf(i * i));
        }
        System.out.println(result);
    }
}
