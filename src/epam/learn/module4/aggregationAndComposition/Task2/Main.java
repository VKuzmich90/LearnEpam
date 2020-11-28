package epam.learn.module4.aggregationAndComposition.Task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

    public static void main(String[] args) {

        Car honda = new Car("Honda Civic");

        honda.run();

        Engine engine = new Engine(300, 1.8);

        honda.setEngine(engine);

        honda.run();

        int whellDiameter = 40;
        honda.setWheels(new Wheel(whellDiameter, true), new Wheel(whellDiameter, true),
                new Wheel(whellDiameter, true), new Wheel(whellDiameter, true));


        honda.run();

        honda.refuel();
        honda.run();

        honda.getWheels().get(2).breakWheel(); //cломалось колесо
        honda.run();

        honda.changeWheel();
        honda.run();

        honda.printModel();
    }
}
