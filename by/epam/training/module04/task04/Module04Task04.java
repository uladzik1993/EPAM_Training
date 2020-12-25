package by.epam.training.module04.task04;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.ArrayList;


public class Module04Task04 {

    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();

        Train one = new Train();
        one.setTrain("Moscov", 723, "11:30");
        trains.add(one);

        Train two = new Train();
        two.setTrain("Minsk", 324, "8:30");
        trains.add(two);

        Train three = new Train();
        three.setTrain("Minsk", 101, "10:00");
        trains.add(three);

        Train four = new Train();
        four.setTrain("Brest", 243, "15:40");
        trains.add(four);

        Train five = new Train();
        five.setTrain("Mohilev", 87, "13:45");
        trains.add(five);
    }
}
