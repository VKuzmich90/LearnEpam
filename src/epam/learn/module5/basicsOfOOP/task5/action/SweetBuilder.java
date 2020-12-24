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

import epam.learn.module5.basicsOfOOP.task5.entity.sweets.*;

public class SweetBuilder {

    public Sweetness getSweets(String name) {
        Sweetness toReturn = null;

        switch (name) {
            case "candy":
                toReturn = new Candy("candy", 40);
                break;

            case "chocolate":
                toReturn = new Chocolate("chocolate", 50);
                break;

            case "marmalade":
                toReturn = new Marmalade("marmalade", 20);
                break;

            case "marshmallow":
                toReturn = new Marshmallows("marshmallow", 25);
                break;

            case "biscuit":
                toReturn = new Biscuit("biscuit", 10);
                break;

            default:
                System.out.println("Enter the correct name of the sweet!");
                break;
        }

        return toReturn;
    }

}
