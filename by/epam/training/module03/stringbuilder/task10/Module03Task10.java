package by.epam.training.module03.stringbuilder.task10;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.

import java.util.Arrays;

public class Module03Task10 {

    public static void main(String[] args) {
        String x = "Здравствуйте, как вас зовут? Меня зовут Василий. Я очень злой!";
        countNumberOfOffers(x);
    }
    private static void countNumberOfOffers (String str) {
        String[] offArray = str.split("[!.?]");
        System.out.println("Колличество предложений: " + offArray.length);
    }
}
