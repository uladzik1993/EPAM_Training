package by.epam.training.module02.decomposition.task12;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.Arrays;

public class Module02Task12 {
    public static void main(String[] args) {
        int k = 10;
        int n = 5;
        int l = 5;
        int[] a = new int[l];

        buildArray(k, n, a);
    }

    public static void buildArray(int k, int n, int[] array) {
        int sum = 0;
        while (sum != k) {
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * (n + 1));
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
