package epam.learn.module5.basicsOfOOP.task5.action;
/** Создать консольное приложение, удовлетворяющее следующим требованиям:

 Корректно спроектируйте и реализуйте предметную область задачи.
 Для создания объектов из иерархии классов продумайте возможность использования порождающих
 шаблонов проектирования.
 Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 для проверки корректности переданных данных можно применить регулярные выражения.
 Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

 Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 Составляющими целого подарка являются сладости и упаковка.
 */


import epam.learn.module5.basicsOfOOP.task5.entity.Present;
import epam.learn.module5.basicsOfOOP.task5.entity.packaging.Box;
import epam.learn.module5.basicsOfOOP.task5.entity.packaging.BoxColour;
import epam.learn.module5.basicsOfOOP.task5.entity.packaging.BoxMaterial;
import epam.learn.module5.basicsOfOOP.task5.entity.sweets.Sweetness;
import java.util.Scanner;
import static epam.learn.module5.basicsOfOOP.task5.action.SweetBuilder.getSweets;

public class Application {

    Scanner in = new Scanner(System.in);

    public void run() {

        Box box = choiceBox();

        Present present = new Present(box);

        addSweetsInPresent(present);

        System.out.println(present.toString());
    }

    public Box choiceBox() {
        BoxMaterial material;
        BoxColour colour;

        System.out.print("\t\tGetting started creating a gift" + "\nSelect material for packaging: "
                + "cardboard, wood, metal." + "\nWrite material: ");

        material = BoxMaterial.valueOf(in.next().toUpperCase());

        System.out.print("\nSelect the colour of the package: red, green, white, blue, yellow"
                + "\nWrite colour: ");

        colour = BoxColour.valueOf(in.next().toUpperCase());

        return new Box(material, colour);
    }

    public void addSweetsInPresent(Present coolPresent) {

        System.out.print("\nSelect the sweets to add as a gift: "
                + "biscuit, candy, chocolate, marmalade, marshmallow" +
                "\nIf there are enough sweets, then write 'exit'\n>>");

        do {
            Sweetness sweet = getSweets(in.next());

            if (sweet != null) {
                coolPresent.addSweets(sweet);
            }

            System.out.print("Maybe something else?)\n>>");
        } while (!in.hasNext("exit"));
    }

}
