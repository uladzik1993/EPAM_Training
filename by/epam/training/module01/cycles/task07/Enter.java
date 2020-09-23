package by.epam.training.module01.cycles.task07;

import java.util.Scanner;

public class Enter {

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
}
