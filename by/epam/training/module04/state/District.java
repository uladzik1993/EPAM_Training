package by.epam.training.module04.state;

public class District extends Administration {
    private City mainCity;

    public District() {
        super();
    }

    public District(String name) {
        super(name);
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity (City mainCity) {
        this.mainCity = mainCity;
    }

}
