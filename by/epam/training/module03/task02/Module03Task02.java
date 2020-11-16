package by.epam.training.module03.task02;

// Замените в строке все вхождения 'word' на 'letter'.

import java.util.Scanner;

public class Module03Task02 {

    public static void main(String[] args) {
        String iWantToSay = enter("What do you want to say?");
        iWantToSay = iWantToSay.replaceAll("word", "letter");
        System.out.println("You enter: " + iWantToSay);

    }

    public static String enter(String massage) {
        System.out.println(massage);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
