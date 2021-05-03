package by.epam.training.module04.garage;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuel;

    public Car(String brand, double consumption, Engine engine,
               Wheel[] wheels, double fuel) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        String text = "";

        text += "\n Марка авто: " + brand + engine.toString() + "; \n Расход топлива: " + consumption +
                " L/100km \n Колеса: " + wheels[0].toString();

        return text;
    }

    public void move () {
        if (fuel <= 0) {
            System.out.println("\n Топливо закончилось");
            return;
        }
        double distance = fuel / consumption;
        System.out.println("\n Машина проехала " + distance * 100 + "км.");
        fuel = 0;
    }

    public void addFuel (double value) {
        fuel += value;
        System.out.println("\n Машина заправленна, можно ехать");
    }

    public void viewInfo() {
        System.out.println(toString());
    }

}
