package by.epam.training.module03.stringbuilder.task01;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Module03Task01 {

    public static void main(String[] args) {
        String text = "Меня   зовут Ник,    мой лучший     друг               Майк.";

        System.out.println(text);
        System.out.println("Наибольшее колличество подряд идущих пробелов: " + countingGaps(text));
    }

    private static int countingGaps(String str) {
        String tmp = " ";
        int countMax = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int count = 0;
                while (str.charAt(i++) == ' ') {
                    count++;
                    if (count > countMax) {
                        countMax = count;
                    }
                }
            }
        }
        return countMax;
    }
}
