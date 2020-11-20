package by.epam.training.module03.string.task02;

// Замените в строке все вхождения 'word' на 'letter'.

import java.util.Scanner;

public class Module03Task02 {

    private static void main(String[] args) {
        String iWantToSay = enter("What do you want to say?");
        iWantToSay = iWantToSay.replaceAll("word", "letter");
        System.out.println("You enter: " + iWantToSay);

    }

    private static String enter(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
