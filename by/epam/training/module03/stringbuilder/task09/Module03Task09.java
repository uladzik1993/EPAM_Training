package by.epam.training.module03.stringbuilder.task09;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

import java.util.Scanner;

public class Module03Task09 {

    public static void main(String[] args) {
        String text = enter("Начни вводить текст: ");
        count(text);
    }

    private static String enter(String massage) {
        System.out.println(massage);
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        if (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        return massage = sb.toString();
    }

    private static void count(String str) {
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a') & (str.charAt(i) <= 'z')) lowerCase++;
            if ((str.charAt(i) >= 'A') & (str.charAt(i) <= 'Z')) upperCase++;
        }
        System.out.printf("Всего %d заглавных букв и %d прописных.\n", upperCase, lowerCase);
    }
}

