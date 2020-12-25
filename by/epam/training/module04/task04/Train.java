package by.epam.training.module04.task04;

public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public void setTrain(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
