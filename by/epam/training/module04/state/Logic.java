package by.epam.training.module04.state;

import java.util.ArrayList;

public class Logic {

    public static ArrayList<District> addDistrict(ArrayList<District> list, District dst) {
        list.add(dst);
        return list;
    }

    public static ArrayList<Region> addRegion(ArrayList<Region> list, Region reg) {
        list.add(reg);
        return list;
    }
}
