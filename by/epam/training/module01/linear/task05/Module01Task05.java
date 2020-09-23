package by.epam.training.module01.linear.task05;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

import java.util.Scanner;

public class Module01Task05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время в секундах");

        int second = scanner.nextInt();
        int minute = second / 60;

        second = second - (minute * 60);

        int hour = minute / 60;
        minute = minute - (hour * 60);

        System.out.println("Точное время: " + hour + " часа " + minute + " минут " + second + " секунд.");

    }
}
