// Создать класс Airline, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Airline,
// с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.

// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

// Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели,
// время вылета для которых больше заданного.

package by.epam.training.module04.task10;

import javax.swing.plaf.PanelUI;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {
    private String destination;
    private int flightNumber;
    private String airbusType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline () {
        super();
        String defaultDestanation = "Minsk";
        int defaultFlightNumber = 34285;
        String defaultAirbusType = "Boeing";
        LocalTime defaultDepartureTime = LocalTime.of(2,30);
        DayOfWeek defaultDayOfWeek = DayOfWeek.FRIDAY;
        this.destination = defaultDestanation;
        this.flightNumber = defaultFlightNumber;
        this.airbusType = defaultAirbusType;
        this.departureTime = defaultDepartureTime;
        this.dayOfWeek = defaultDayOfWeek;

        new Airline(defaultDestanation, defaultFlightNumber, defaultAirbusType,
                defaultDepartureTime, defaultDayOfWeek);
    }

    public Airline(String destination, int flightNumber, String airbusType,
                   LocalTime departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airbusType = airbusType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirbusType() {
        return airbusType;
    }

    public void setAirbusType(String airbusType) {
        this.airbusType = airbusType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public  String toString() {
        return this.getClass().getName() + "destanation = " + destination +
                ", flightNumber = " + flightNumber + ", airbusType = " +
                airbusType + ", departureTime = " + departureTime + "]";
    }
}
