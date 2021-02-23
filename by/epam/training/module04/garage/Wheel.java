package by.epam.training.module04.garage;


import java.lang.reflect.Type;
import java.util.Scanner;

public class Wheel {
    public enum type { Winter, Summer }

    int r;
    private String brand;
    private Type type;

    public Wheel (String brand, int r, Type type) {
        this.brand = brand;
        this.r = r;
        this.type = type;
    }

    @Override
    public String toString() {
        String info = null;
        info += "\n Производитель: " + brand + "\n Радиус: " + r;
        if (type == Type.Winter)
            info += "Winter";
        else
            info += "Summer";

        return info;
    }

    public Wheel get (Scanner scaner) {
        Wheel wheel;
      return wheel;
    };
}
