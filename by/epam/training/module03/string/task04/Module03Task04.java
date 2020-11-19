package by.epam.training.module03.string.task04;

// В строке найти количество чисел.

public class Module03Task04 {

    public static void main(String[] args) {
        String iSay = "My car will need 30 liters of fuel to travel 250 kilometers, which will cost $ 22.";

        System.out.println(iSay);
        System.out.println();
        System.out.println("В данном предложении найдено " + countNumbers(iSay) + " числа.");
    }

    private static int countNumbers(String str) {
        String[] array = str.split("\\D+");
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            count++;
        }
        return count;
    }


}
