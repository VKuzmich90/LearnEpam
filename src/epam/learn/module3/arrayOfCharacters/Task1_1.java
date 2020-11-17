package epam.learn.module3.arrayOfCharacters;

/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1_1 {


    public static void main(String[] args) {
        String[] camelCase = {"oneTwo", "threeFour", "fiveSix", "sevenEight", "nineTen"};

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", toSnakeCase(camelCase)));
    }

    private static String[] toSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];

        for (int k = 0; k < camelCase.length; k++) {
            String camel = camelCase[k];

            char[] snakeChars = new char[camel.length() + uppercaseCount(camel)];
            char[] camelChars = camel.toCharArray();
            int i = 0;
            int j = 0;

            while (i < camelChars.length) {
                char ch = camelChars[i];

                if (Character.isUpperCase(ch)) {
                    snakeChars[j++] = '_';
                    snakeChars[j++] = Character.toLowerCase(camelChars[i++]);
                } else {
                    snakeChars[j++] = camelChars[i++];
                }
            }
            snakeCase[k] = new String(snakeChars);
        }
        return snakeCase;
    }

    private static int uppercaseCount(String string) {
        int result = 0;

        for (char ch : string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result++;
            }
        }

        return result;
    }
}

