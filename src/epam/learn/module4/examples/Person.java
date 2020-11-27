package epam.learn.module4.examples;

import java.util.Arrays;

public class Person {

    public void method(int ... values ) {
        if(values.length != 0) {
            System.out.println(Arrays.toString(values));
        } else {
            System.out.println("without values");
        }
    }

    public void method(int a, int b) {
        System.out.println(a + " " + b);
    }
}
