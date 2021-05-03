package by.epam.training.module04.state;

public class View {

    public static void printCapital(State ourState) {
        System.out.println("Столица государства: ");
        System.out.println(ourState.getCapital().getName());
    }

    public static void printRegionNumber(State ourState) {
        System.out.println("Количество областей: ");
        System.out.println(ourState.getDistrictList().size());
    }

    public static void printArea(State ourState) {
        System.out.println("Площадь государства: ");
        System.out.println(ourState.getArea());
    }
}
