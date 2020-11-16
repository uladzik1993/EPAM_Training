package by.epam.training.module03.task01;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Module03Task01 {
    public static void main(String[] args) {
        String[] pack = new String[]{"bigPig", "littlePony", "tallGiraffe", "badGuy"};

        System.out.println("Уменя есть массив названий переменных в camelCase: ");
        printArray(pack);

        System.out.println(" ");
        System.out.println(" ");

        transformation(pack);

        System.out.println("Преобразую его в snake_case: ");
        printArray(pack);
    }


    public static void transformation(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = camelToSnake(str[i]);
        }
    }

    public static String camelToSnake(String str) {
        String result = "";
        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result = result + Character.toLowerCase(ch);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
