package by.epam.training.module03.stringbuilder.task07;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.Scanner;

public class Module03Task07 {
    public static void main(String[] args) {
        String iSay = enter();
        System.out.println(fixThis(iSay));

    }

    private static String enter() {
        System.out.println("Напишите что нибудь");

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        if (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        return sb.toString();
    }

    private static String fixThis(String str) {
        return deleteDoubleWords(deleteSpace(str));
    }

    private static String deleteSpace(String str) {
        return str.replaceAll("\\s+", "");
    }

    private static String deleteDoubleWords(String str) {
        StringBuilder noDuplicates = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String si = str.substring(i, i + 1);
            if (noDuplicates.indexOf(si) == -1) {
                noDuplicates.append(si);
            }
        }
        return noDuplicates.toString();
    }
}