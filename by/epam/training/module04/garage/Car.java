package by.epam.training.module04.garage;

import java.util.*;

public class Car {
    private Wheel wheels[];
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuel;

    public  Car (String brand, double consumption, Engine engine,
                 Wheel wheels[], double fuel) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        String text = "";

        text += brand + engine.toString() + ";" + consumption + "L/100km { ";

        for (int i = 0; i<4; i++) {
            text+=wheels[i].toString() + " ";
        }

        return text + ")";
    }
}
