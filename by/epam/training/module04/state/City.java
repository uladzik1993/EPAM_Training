package by.epam.training.module04.state;

public class City extends Administration {
    private String regionName;
    private String districtName;

    public City() {
        super();
        this.setName("Untitled");
    }

    public City(String name) {
        super(name);
    }

    public String getRegionName() {
        return regionName;
    }

    public String getDistrictName() {
        return districtName;
    }
}
