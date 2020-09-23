package by.epam.training.module01.branch.task02;

import java.util.Scanner;

public class Max {

    public static int enterInt(String name) {

        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println("Введите число " + name);

        while (!sc.hasNext()) {
            sc.nextInt();
            System.out.println("Введите число " + name);
        }

        value = sc.nextInt();
        return value;
    }

    public static void result(int a, int b, int c, int d) {

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int max = Math.max(min1, min2);

        System.out.println("Мой выбор: " + max);
    }
}
