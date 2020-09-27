package by.epam.training.module02.array.task08;

// Дана последовательность целых чисел a1, a2,..a(n). Образовать новую последовательность, выбросив из
// исходной те члены, которые равны min(a1, a2,..a(n)).

import java.util.Arrays;

public class Module02Task08 {

    public static void main(String[] args) {
        int[] mass = new int[]{-7, 2, 14, 11, -29, 17};
        int min = mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }

        int N = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != min) {
                N++;
            }
        }

        int[] mass2 = new int[N];
        int x = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != min) {
                mass2[x] = mass[i];
                x++;
            }
        }

        System.out.println(Arrays.toString(mass2));

    }
}
