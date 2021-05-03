package by.epam.training.module04.state;

public class Administration {
    private int area;
    private String name;

    public Administration() {
        //super(); тебе не нужно вызывать этот метод явно. во первых ты ни от чего не наследуешься.
        // во вторых этот метод по умолчанию неявно вызывается. был бы смысл если бы ты чтото передовал
        // https://javarush.ru/groups/posts/1187-raznica-mezhdu-kljuchevihmi-slovami-this-i-super-v-java
    }

    public Administration(int area, String name) {
        this.area = area;
        this.name = name;
    }

    public Administration (String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
