package by.epam.training.module04.task04;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Terminal {

    public static void main(String[] args) {

        ArrayList<Train> trains = new ArrayList<>();

        Train one = buildTrain("Moscov", 723, "11:30");
        trains.add(one);

        Train two = buildTrain("Minsk", 324, "8:30");
        trains.add(two);

        Train three = buildTrain("Minsk", 101, "10:00");
        trains.add(three);

        Train four = buildTrain("Brest", 243, "15:40");
        trains.add(four);

        Train five = buildTrain("Mohilev", 87, "13:45");
        trains.add(five);

        System.out.println(trains.get(4).getDestination());


    }

    private static Train buildTrain(String destination, int trainNumber, String departureTime) {
        Train train = new Train();
        train.setDestination(destination);
        train.setTrainNumber(trainNumber);
        train.setDepartureTime(departureTime);
        return train;
    }


}

