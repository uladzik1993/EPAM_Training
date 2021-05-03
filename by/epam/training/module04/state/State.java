package by.epam.training.module04.state;

import java.util.ArrayList;
import java.util.List;

public class State extends Administration {
    private List<Region> regionList;
    private List<District> districtList;
    private City capital;

    public State() {
        this.setName("unName");
        this.setCapital(new City());

        ArrayList<District> districtList = new ArrayList<>();
        District dst = new District("UnNamedDistrict");
        districtList.add(dst);
        this.setDistrictList(districtList);
        this.setCapital(new City());
        this.setArea(123456789);
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList (List<District> districtList) {
        this.districtList = districtList;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }


}
