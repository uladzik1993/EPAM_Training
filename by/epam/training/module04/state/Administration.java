package by.epam.training.module04.state;

public class Administration {
    private int area;
    private String name;

    public Administration() {
        super();
    }

    public Administration(int area, String name) {
        super();
        this.area = area;
        this.name = name;
    }

    public Administration (String name) {
        super();
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
