package epam.learn.module1.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        if (n <= m) {
            int k = m;
            m = n;
            n = k;
        }

        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + ": " + j + " ");
                }
            }
        }
    }
}
