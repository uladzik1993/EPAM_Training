package by.epam.training.module02.array.task05;

//Даны целые числа а1 ,а2 ,..., а(n) .
// Вывести на печать только те числа, для которых а(i) > i.

import java.util.Arrays;

public class Module02Task05 {

    public static void main(String[] args) {
        int number = 12;
        int[] mass = new int[number];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * number);
        }

        System.out.println("Создан массив: " + Arrays.toString(mass));
        System.out.println("Числа которые больше своего номера ячейки ( a(i) > i ) : ");

        for (int r = 0; r < mass.length; r++) {
            if (mass[r] > r) {
                System.out.print(" " + mass[r] + " ");
            }
        }
    }
}
