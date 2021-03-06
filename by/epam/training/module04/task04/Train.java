package by.epam.training.module04.task04;

import java.util.Comparator;

public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public static class sortByNumber implements Comparator<Train> {
        @Override
        public int compare(Train left, Train right) {
            return left.trainNumber - right.trainNumber;
        }
    }

    public static class sortByDestinationAndTime implements Comparator<Train> {
        @Override
        public int compare(Train left, Train right) {
            if (left.destination == right.destination) {
                return left.departureTime.compareTo(right.departureTime);
            }
            return left.destination.compareTo(right.destination);
        }
    }
    public void print() {
        System.out.println(trainNumber + " -> " + destination + " : " + departureTime);
    }

}

