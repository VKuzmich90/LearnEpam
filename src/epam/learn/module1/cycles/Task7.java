package epam.learn.module1.cycles;

public class Task7 {

    public static void main(String[] args) {
        int number1 = 1230562;
        int number2 = 87650012;
        int number2Copy;
        int numeral;

        while (number1 > 0) {
            numeral = number1 % 10;
            number1 /= 10;
            number2Copy = number2;
            int counter = 1;

            while (number2Copy > 0) {
                if (numeral == number2Copy % 10) {
                    System.out.print(numeral + " ");
                    number2 = number2Copy / 10 * counter + number2 % counter;
                    break;
                } else {
                    counter *= 10;
                }
                number2Copy /= 10;
            }
        }

    }
}
