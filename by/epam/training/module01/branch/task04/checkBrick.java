package by.epam.training.module01.branch.task04;

import java.util.Scanner;

public class checkBrick {

    public static int enterSize(String name) {

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

    public static void result(int a, int b, int x, int y, int z) {
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.print("Ну хз, я думаю запихнем как нибудь");
        } else System.out.print("Не, не пройдет");
    }
}
