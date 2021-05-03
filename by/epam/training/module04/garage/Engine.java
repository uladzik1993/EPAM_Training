package by.epam.training.module04.garage;

public class Engine {
    private int id;
    private double power;

    public Engine(int id, double power) {
        this.id = id;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "\n Номер двигателя: " + id + " " + "\n Мощность двигателя: " + power;
    }
}
