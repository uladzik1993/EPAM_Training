package by.epam.training.module04.state;

public class View {
    State ourState = new State();

    public void printCapital() {
        System.out.println("Столица государства: ");
        System.out.println(ourState.getCapital().getName());
    }

    public void printRegionNumber() {
        System.out.println("Количество областей: ");
        System.out.println(ourState.getDistrictList().size());
    }

    public void printArea() {
        System.out.println("Площадь государства: ");
        System.out.println(ourState.getArea());
    }
}
