package by.epam.training.module04.state;

import java.util.ArrayList;

// Создать объект класса Государство, используя классы:
// Область, Район, Город.
// Методы:
// вывести на консоль столицу, количество областей, площадь, областные центры.

public class Main {
    public static void main(String[] args) {

        ArrayList<District> districtList = new ArrayList<>();
        State state = new State();

        View.printCapital(state);
        View.printRegionNumber(state);
        View.printArea(state);
    }
}
