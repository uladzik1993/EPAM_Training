package by.epam.training.module02.decomposition.task10;

// Дано натуральное число N.
// Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.

import java.util.Arrays;

public class Module02Task10 {

    public static void main(String[] args) {

        int number = 10;
        int count = 0;
        int temp = number;
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

    }
}
