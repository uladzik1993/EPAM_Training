package by.epam.training.module03.string.task05;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
// заменить на одиночные пробелы. Крайние пробелы в строке удалить.

public class Module03Task05 {
    public static void main(String[] args) {
        String say = "   Выпью 2     стакана молока            и сьем   огурец.    ";

        System.out.println(errorCorrection(say));
    }

    private static String errorCorrection(String str) {
        str = str.trim();
        str = str.replaceAll("[\\s]{2,}", " ");
        return str;
    }
}
