package by.epam.training.module02.array.task09;

// В массиве целых чисел с количеством элементов n
// найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

import java.util.Arrays;

public class Module02Task09 {

    public static void main(String[] args) {

        int[] numbers = new int[]{8, 12, 13, -3, 17, -9, 12, 22, 13};
        int repeat = 1;
        int num = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    repeat++;
                    num = numbers[i];
                    System.out.println(numbers[i]);
                }
                }
            }
        }
    }
