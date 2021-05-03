package by.epam.training.module04.garage;

public class Wheel {
    public enum Type {WINTER, SUMMER} // лучше бы отдельным классом енам создать.и с большой буквы
    // плюс тебе не нужен NULL енам, там по умолчанию будет налл если не задано иное

    private int r;
    private String brand;
    private Type type;

    public Wheel() {
        r = 0;
        brand = "Параметр не задан";
        //type = Type.Null;  не нужно объявлять это явно
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
        if (type == Type.WINTER) {
            info += "Зимние"; // вообще это можно было бы переделать, если в енаме задавать строковые значения
            // как тут https://javarush.ru/groups/posts/2329-preobrazovanie-enum-v-string
        }
        if (type == Type.SUMMER) {
            info += "Летние";
        } else {
            info += "Параметр не задан";
        }
        return info;
    }
}
