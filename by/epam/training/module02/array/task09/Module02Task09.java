package by.epam.training.module02.array.task09;

// В массиве целых чисел с количеством элементов n
// найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

import java.util.Arrays;

public class Module02Task09 {

    public static void main(String[] args) {

        int[] numbers = new int[]{12, 13, -3, 17, -9, 12, 22, 13};

        int maxRepeat = 1;
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int repeat = 1;

                if (numbers[i] == numbers[j]) {
                    repeat++;

                    if (repeat > maxRepeat) {
                        maxRepeat = repeat;
                        result = numbers[i];
                    } else if (repeat == maxRepeat) {
                        if (numbers[i] < result) {
                            result = numbers[i];
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
