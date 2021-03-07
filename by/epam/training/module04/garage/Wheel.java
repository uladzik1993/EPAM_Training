package by.epam.training.module04.garage;

public class Wheel {
    public enum Type {Winter, Summer, Null}

    int r;
    private String brand;
    private Type type;

    public Wheel() {
        r = 0;
        brand = "Параметр не задан";
        type = Type.Null;
    }

    public Wheel(String brand, int r, Type type) {
        this.brand = brand;
        this.r = r;
        this.type = type;
    }

    public int getRadius() {
        return r;
    }

    @Override
    public String toString() {
        String info = "";
        info += "\n Производитель: " + brand + "\n Радиус: " + r + "\n Тип: ";
        if (type == Type.Winter)
            info += "Зимние";
        if (type == Type.Null)
            info += "Параметр не задан";
        else
            info += "Летние";

        return info;
    }
}
