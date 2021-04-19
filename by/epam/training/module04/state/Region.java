package by.epam.training.module04.state;

public class Region extends Administration {

    private City mainCity;

    public Region() {
        super();
    }

    public Region(String name) {
        super(name);
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity(City mainCity) {
        this.mainCity = mainCity;
    }

}
