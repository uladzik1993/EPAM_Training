package by.epam.training.module04.state;

import java.util.List;

public class StateService {

    public static List<District> addDistrict(List<District> list, District district) {
        list.add(district);
        return list;
    }

    public static List<Region> addRegion(List<Region> list, Region region) {
        list.add(region);
        return list;
    }
}
