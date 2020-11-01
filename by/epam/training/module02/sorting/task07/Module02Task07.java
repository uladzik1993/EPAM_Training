package by.epam.training.module02.sorting.task07;

//Пусть даны две неубывающие последовательности действительных чисел a1<=a2<...<=an, b1<=b2<=...<=bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm. в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

import by.epam.training.module02.sorting.task06.Module02Task06;

import java.util.Arrays;

public class Module02Task07 {

    public static void main(String[] args) {

        int[] a = new int[]{1, 3, 5, 7, 9};
        int[] b = new int[]{2, 4, 6, 8, 10};
        int[] tmp = new int[a.length + b.length];
        int count = 0;
        boolean result = true;

        for (int i = 0; i < b.length; i++) {
            tmp[count] = a[i];
            tmp[count + 1] = b[i];
            count += 2;
        }

        Module02Task06.shellSort(tmp);

        for (int number = 0; number < b.length; number++) {
            for (int search = 0; search < tmp.length; search++) {
                if (b[number] == tmp[search]) {
                    System.out.println("Число " + b[number] + " записываем " + (search + 1) + "-м по порядку.");
                }
            }
        }

        System.out.println();
        System.out.println("Получается вот такая последовательность");
        System.out.println(Arrays.toString(tmp));


    }
}
