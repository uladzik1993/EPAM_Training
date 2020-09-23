package by.epam.training.module01.branch.task03;

import java.util.Scanner;

public class Engine {

    public static int enterInt(String name) {

        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println(name);

        while (!sc.hasNext()) {
            sc.nextInt();
            System.out.println(name);
        }

        value = sc.nextInt();
        return value;
    }

    public static boolean result(int x1, int x2, int x3, int y1, int y2, int y3) {

        boolean result;

        if (x1 == x2 & x1 == x2 & x1 == x3) {
            result = true;
        } else if (y1 == y2 & y1 == y2 & y1 == y3) {
            result = true;
        } else result = false;

        return result;
    }
}



