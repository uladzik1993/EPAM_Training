package by.epam.training.module01.cycles.task01;

import java.util.Scanner;

public class EnterInt {

    public static int enterInt(String name) {

        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println(name);

        while (!sc.hasNextInt()) {
            sc.nextInt();
            System.out.println(name);
        }

        value = sc.nextInt();
        return value;
    }

    public static int sum(int number) {

        int value = 0;

        for (int x = 1; x <= number; x++) {
            value += x;
        }

        return value;
    }
}
