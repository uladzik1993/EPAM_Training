package by.epam.training.module03.stringbuilder.task09;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

import java.util.Scanner;

public class Module03Task09 {

    public static void main(String[] args) {
        String text = enter("Начни вводить текст: ");


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
}
