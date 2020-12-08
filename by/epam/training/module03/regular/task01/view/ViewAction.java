package by.epam.training.module03.regular.task01.view;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ViewAction {

    public void printArrayOfString(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            System.out.println();
        }

    }

    public int enterIntFromConsole(String str, int minValue, int maxValue) {

        int result;
        boolean check;
        Scanner in = new Scanner(System.in);

        System.out.print(str);

        do {
            check = true;
            while (!in.hasNextInt()) {
                in.next();
                System.out.println("Значение должно быть числом от " + minValue + " до " + maxValue);
            }

            result = in.nextInt();

            if (result > maxValue || result < minValue) {
                System.out.println("Значение должно быть от " + minValue + " до " + maxValue);
                check = false;
            }

        } while (!check);

        return result;
    }

    public String enterCharFromConsole(String str) {
        Scanner in = new Scanner(System.in);
        System.out.println(str);

        while (!in.hasNext("[/w/W]{1}")) {
            in.next();
            System.out.print(str);
        }
        return in.next();
    }


    public String readFileAsString(String fileName) throws Exception {

        String data = "";

        data = new String(Files.readAllBytes(Paths.get(fileName)));

        return data;

    }

}

