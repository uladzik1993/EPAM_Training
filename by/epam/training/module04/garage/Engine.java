package by.epam.training.module04.garage;

public class Engine {
    int id;
    double power;

    public Engine (int id, double power) {
        this.id = id;
        this.power = power;
    }

    @Override
    public String toString() {
        return "\n Номер двигателя: " + id + " " + "\n Мощность двигателя: " + power;
    }
}
