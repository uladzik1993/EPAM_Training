package by.epam.training.module03.stringbuilder.task07;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.Scanner;

public class Module03Task07 {
    public static void main(String[] args) {
        String iSay = enter("Напишите что нибудь");
        System.out.println(fixThis(iSay));

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

    private static String deleteSpace(String str) {
        str = str.replaceAll("\\s+", "");
        return str;
    }

    private static String deleteDoubleWords(String str) {
        StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String si = str.substring(i, i + 1);
            if (noDupes.indexOf(si) == -1) {
                noDupes.append(si);
            }
        }
        return noDupes.toString();
    }

    private static String fixThis(String str) {
        str = deleteDoubleWords(deleteSpace(str));
        return str;
    }
}