package by.epam.training.module03.stringbuilder.task08;

// Вводится строка слов, разделенных пробелами.
// Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

import java.util.Scanner;

public class Module03Task08 {

    public static void main(String[] args) {
        String words = enter();
        viewLongerWord(words);
    }

    private static String enter() {
        System.out.println("Введите несколько слов через пробел, а я выберу самое длиинное");
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        if (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        return sb.toString();
    }

    private static void viewLongerWord(String words) {
        String[] wordsArray = createArray(words);
        String longest = searchLongest(wordsArray); // не переназначай параметры метода, создавай новую переменную
        System.out.println(longest);
    }

    private static String[] createArray(String str) {
        return str.split(" ");
    }

    private static String searchLongest(String[] arr) {
        String longest = null;
        int size = 0;
        int count = 0;

        for (String s : arr) {
            if (s.length() >= size) {
                if (s.length() == size) {
                    count += 1;
                }
                longest = s;
                size = s.length();
            }
        }
        if (count > 0) {
            longest = "Два и более длинных слова";
        }
        return longest;
    }
}
