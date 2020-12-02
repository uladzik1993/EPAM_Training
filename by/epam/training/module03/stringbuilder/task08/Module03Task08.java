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

    private static void viewLongerWord(String str) {
        String[] strArray = creatArray(str);
        str = searchLong(strArray);
        System.out.println(str);
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

    private static String[] creatArray(String str) {
        return str.split(" ");
    }

    private static String searchLong(String[] arr) {
        String longer = null;
        int size = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= size) {
                if (arr[i].length() == size) {
                    count += 1;
                }
                longer = arr[i];
                size = arr[i].length();
            }
        }
        if (count > 0) {
            longer = "Два и более длинных слова";
        }
        return longer;
    }
}
