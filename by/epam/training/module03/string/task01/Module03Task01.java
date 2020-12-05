package by.epam.training.module03.string.task01;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Module03Task01 {
    public static void main(String[] args) {
        String[] pack = new String[]{"bigPig", "littlePony", "tallGiraffe", "badGuy"};

        System.out.println("Уменя есть массив названий переменных в camelCase: ");
        printArray(pack);

        System.out.println(" ");
        System.out.println(" ");

        transformIntoSnakeCase(pack);

        System.out.println("Преобразую его в snake_case: ");
        printArray(pack);
    }


    private static void transformIntoSnakeCase(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = camelToSnake(str[i]);
        }
    }

    private static String camelToSnake(String str) {
        StringBuilder result = new StringBuilder();
        char c = str.charAt(0);
        result.append(Character.toLowerCase(c));

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append('_');
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
