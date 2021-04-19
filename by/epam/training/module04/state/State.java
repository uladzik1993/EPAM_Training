package by.epam.training.module04.state;

import java.util.ArrayList;

public class State extends Administration {
    private ArrayList<Region> regionList;
    private ArrayList<District> districtList;
    private City capital;

    public State() {
        super();
        this.setName("unName");
        this.setCapital(new City());

        ArrayList<District> districtList = new ArrayList<District>();
        District dst = new District("UnNamedDistrict");
        districtList.add(dst);
        this.setDistrictList(districtList);
        this.setCapital(new City());
        this.setArea(123456789);
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }

    public ArrayList<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList (ArrayList<District> districtList) {
        this.districtList = districtList;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }


}
