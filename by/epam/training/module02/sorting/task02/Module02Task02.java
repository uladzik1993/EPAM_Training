package by.epam.training.module02.sorting.task02;

// Даны две последовательности a1 <= a2 <=...<= an, b1 <= b2 <=...<= bn
// Образовать из них новую последовательность
// чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Module02Task02 {

    public static void main(String[] args) {

        int count = 0;
        int[] a = new int[]{1, 3, 5, 7, 9};
        int[] b = new int[]{0, 2, 4, 6, 8};
        boolean result = true;

        int[] tmp = new int[a.length + b.length];

        //соединяем два массива в один
        for (int i = 0; i < a.length; i++) {
            tmp[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            tmp[count++] = b[j];
        }

        //сортируем по нарастанию
        while (result) {
            result = false;
            for (int num = 1; num < tmp.length; num++) {
                if (tmp[num] < tmp[num - 1]) {
                    int memory = tmp[num];
                    tmp[num] = tmp[num - 1];
                    tmp[num - 1] = memory;
                    result = true;
                }
            }
        }
        System.out.println(Arrays.toString(tmp));
    }
}
