package by.epam.training.module01.branch.task01;

import java.util.Scanner;

public class Triangle {

    public static int enter(String name) {

        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println("Введите угол " + name);

        while (!sc.hasNext()) {
            sc.next();
            System.out.println("Введите угол " + name);
        }

        value = sc.nextInt();
        return value;
    }

    public static void check(int a, int b) {

        int c = 180 - a - b;
        int sum = a + b + c;

        if (a <= 0 | b <= 0 | c <= 0) {
            System.out.println("Такого треугольника не бывает");
        } else if (a == 90 | b == 90 | c == 90) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}