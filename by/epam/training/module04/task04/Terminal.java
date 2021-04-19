package by.epam.training.module04.task04;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.Arrays;

public class Terminal {

    public static void main(String[] args) {

        int n = 5;
        Train trains[] = new Train[n];

        trains[0] = new Train("Moscov", 723, "11:30");
        trains[1] = new Train("Minsk", 324, "8:30");
        trains[2] = new Train("Minsk", 101, "10:00");
        trains[3] = new Train("Brest", 243, "15:40");
        trains[4] = new Train("Mohilev", 87, "13:45");

        Arrays.sort(trains, new Train.sortByNumber());
        for (int i = 0; i < trains.length; ++i) {
            System.out.print(i + " : " + " ");
            trains[i].print();
        }

        System.out.println("\n");


        Arrays.sort(trains, new Train.sortByDestinationAndTime());

        for (int i = 0; i < trains.length; ++i) {
            System.out.print((i + 1) + " : " + " ");
            trains[i].print();
        }
    }
}
