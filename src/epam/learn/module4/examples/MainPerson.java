package epam.learn.module4.examples;

public class MainPerson {
    public static void main(String[] args) {
        Person param = new Person();
//        param.method(42, 3, 5);
//        param.method();
        int[] arr = {4, 5};
        param.method(arr);
        param.method(1, 42);

    }
}
