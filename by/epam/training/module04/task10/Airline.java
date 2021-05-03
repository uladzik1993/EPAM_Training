package by.epam.training.module04.task10;

import java.util.Objects;

public class Airline {
    private String destination;
    private int flightNumber;
    private String airbusType;
    private String departureTime;
    private String dayOfWeek;

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
        return this.getClass().getName() + "destination = " + destination +
                ", flightNumber = " + flightNumber + ", airbusType = " +
                airbusType + ", departureTime = " + departureTime + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, airbusType, departureTime, dayOfWeek);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber && Objects.equals(destination, airline.destination)
                && Objects.equals(airbusType, airline.airbusType) && Objects.equals(departureTime, airline.departureTime)
                && Objects.equals(dayOfWeek, airline.dayOfWeek);
    }
}
