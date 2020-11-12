package epam.learn.module3.arrayOfCharacters;

/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1 {

    public static void main(String[] args) {
        String[] camelCase = {"oneTwo", "threeFour", "fiveSix", "sevenEight", "nineTen"};

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", toSnakeCase(camelCase)));
    }

    private static String[] toSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];

        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char ch = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(ch)) {
                    stringBuilder.append(ch);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(ch));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
