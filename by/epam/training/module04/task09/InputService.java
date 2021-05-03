package by.epam.training.module04.task09;

import java.util.Locale;
import java.util.Scanner;

public class InputService {

    public static String readInput(String inputRequest) {
        System.out.println(inputRequest);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int readYear(String year) {
        System.out.println(year);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        while (!sc.hasNext()) {
            System.out.println(year);
            sc.nextLine();
        }

        return sc.nextInt();
    }
}
