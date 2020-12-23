package epam.learn.module4.aggregationAndComposition.Task2;
/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    private String modelName;

    private Engine engine;

    private List<Wheel> wheels = new ArrayList<>(4);

    private boolean isFuel;

    public Car(String modelName) {
        this.modelName = modelName;
        this.isFuel = false;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }

    public boolean isFuel() {
        return isFuel;
    }

    public void setFuel(boolean fuel) {
        isFuel = fuel;
    }

    public void refuel() {
        this.isFuel = true;
        System.out.println("Машина заправлена.");
    }


    public void changeWheel() {
        for (int i = 0; i < 4; i++) {

            if (!wheels.get(i).isGoodWheel()) {

                System.out.printf("Колесо %d заменено.\n", i + 1);
                this.getWheels().set(i, new Wheel(true));
            }
        }
    }

    public void run() {
        int wheelCounter = 0;
        boolean isEngine = false;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                wheelCounter++;
            }
        }
        if (wheelCounter < 4) {
            System.out.println("В машине не хватает колёс");
        }

        if (engine == null) {
            System.out.println("В машине не установлен двигатель");
        } else {
            isEngine = true;
        }

        if (!isFuel) {
            System.out.println("Закончилось топливо. Заправьте автомобиль.");
        }

        if (isFuel && isEngine && wheelCounter == 4) {
            boolean ready = true;
            for (int i = 0; i < 4; i++) {
                if (!wheels.get(i).isGoodWheel()) { //Проверяем все ли колёса исправны
                    System.out.printf("Колесо %d не исправно. Замените колесо.%n", i + 1);
                    ready = false;
                }
            }
            if (ready) {
                System.out.println("Машина готова ехать");
            }
        }
    }

    public void printModel() {
        System.out.println("\nМодель машины: " + getModelName());
    }

}
