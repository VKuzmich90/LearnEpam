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

public class Application {

    SweetBuilder sweetBuilder = new SweetBuilder();

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

        String choiceMaterial;
        String choiceColour;

        System.out.print("\t\tGetting started creating a gift" + "\nSelect material for packaging: "
                + "cardboard, wood, metal." + "\nWrite material: ");

        while (!(in.hasNext("cardboard") | in.hasNext("wood") | in.hasNext("metal"))) {
            System.out.println("\nUnfortunately, there is no such material, write again: ");
            in.next();
        }

        choiceMaterial = in.next();
        material = BoxMaterial.fromStringTypeBoxMaterial(choiceMaterial);

        System.out.print("\nSelect the colour of the package: red, green, white, blue, yellow"
                + "\nWrite colour: ");

        while (!(in.hasNext("red") | in.hasNext("green") | in.hasNext("white")
                | in.hasNext("blue") | in.hasNext("yellow"))) {

            System.out.println("\nYou have chosen the wrong colour");
            in.next();
        }

        choiceColour = in.next();
        colour = BoxColour.fromString(choiceColour);

        return new Box(material, colour);
    }

    public void addSweetsInPresent(Present coolPresent) {

        System.out.print("\nSelect the sweets to add as a gift: "
                + "biscuit, candy, chocolate, marmalade, marshmallow" + "\nIf there are enough sweets, then write 'exit'\n>>");

        do {
            while (!(in.hasNext("biscuit") | in.hasNext("candy") | in.hasNext("chocolate") | in.hasNext("marmalade")
                    | in.hasNext("marshmallow"))) {

                System.out.println("\nThere is no such yummy, write again\n>>");
                in.next();
            }

            String choiceSweet = in.next();

            Sweetness sweet = sweetBuilder.getSweets(choiceSweet);
            coolPresent.addSweets(sweet);

            System.out.print("Maybe something else?)\n>>");
        } while (!in.hasNext("exit"));
    }

}
