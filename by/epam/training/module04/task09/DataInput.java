package by.epam.training.module04.task09;

import java.util.Locale;
import java.util.Scanner;

public class DataInput {
    public static String checkInput(String inputRequest) {
        System.out.println(inputRequest);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int checkYearPub(String variableName) {
        System.out.println(variableName);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        while (!sc.hasNext()) {
            System.out.println(variableName);
            sc.nextLine();
        }

        int nextInt = sc.nextInt();
        if (nextInt > 1500 || nextInt < 2021) {
            return nextInt;
        } else return 1990;
    }
}
