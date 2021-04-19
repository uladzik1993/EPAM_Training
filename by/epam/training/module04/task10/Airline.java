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

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {
    private String destination;
    private int flightNumber;
    private String airbusType;
    private String departureTime;
    private String dayOfWeek;

    /*public Airline() {
        super();
        String defaultDestanation = "Minsk";
        int defaultFlightNumber = 34285;
        String defaultAirbusType = "Boeing";
        LocalTime defaultDepartureTime = LocalTime.of(2, 30);
        DayOfWeek defaultDayOfWeek = DayOfWeek.FRIDAY;
        this.destination = defaultDestanation;
        this.flightNumber = defaultFlightNumber;
        this.airbusType = defaultAirbusType;
        this.departureTime = defaultDepartureTime;
        this.dayOfWeek = defaultDayOfWeek;

        new Airline(defaultDestanation, defaultFlightNumber, defaultAirbusType,
                defaultDepartureTime, defaultDayOfWeek);
    }
     */

    public Airline(String destination, int flightNumber, String airbusType,
                   String departureTime, String dayOfWeek) {
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "destanation = " + destination +
                ", flightNumber = " + flightNumber + ", airbusType = " +
                airbusType + ", departureTime = " + departureTime + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((airbusType == null) ? 0 : airbusType.hashCode());
        result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + flightNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airline other = (Airline) obj;
        if (airbusType == null) {
            if (other.airbusType != null)
                return false;
        } else if (!airbusType.equals(other.departureTime))
            return false;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (flightNumber != other.flightNumber)
            return false;
        return true;
    }
}
