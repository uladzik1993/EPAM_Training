package by.epam.training.module04.task04;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import by.epam.training.module04.task03.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Module04Task04 {

    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();

        Train one = new Train();
        trains.add(one);
        one.setDestination("Moscov");
        one.setTrainNumber(723);
        one.setDepartureTime("11:30");

        Train two = new Train();
        trains.add(two);
        two.setDestination("Minsk");
        two.setTrainNumber(324);
        two.setDepartureTime("8:30");

        Train three = new Train();
        trains.add(three);
        three.setDestination("Minsk");
        three.setTrainNumber(101);
        three.setDepartureTime("10:00");

        Train four = new Train();
        trains.add(four);
        four.setDestination("Brest");
        four.setTrainNumber(243);
        four.setDepartureTime("15:40");

        Train five = new Train();
        trains.add(five);
        five.setDestination("Mohilev");
        five.setTrainNumber(87);
        five.setDepartureTime("13:45");

        System.out.println(trains.size());
    }
    public static void sortTrainNumber (ArrayList<Train> array) {
        ArrayList<Train> tmp = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getTrainNumber() > array.get(i+1).getTrainNumber()) {

            }
        }

    }

}
