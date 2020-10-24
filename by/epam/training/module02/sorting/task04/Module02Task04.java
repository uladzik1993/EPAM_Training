package by.epam.training.module02.sorting.task04;

//Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai, a(i+1) . Если ai>a(i+1), то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;

public class Module02Task04 {

    public static void main(String[] args) {

        int[] cat = new int[]{0, 6, 12, 19, 20, 24};
        boolean result = true;
        int count = 0;

        while (result) {

            result = false;

            for (int num = 1; num < cat.length; num++) {
                count++;
                if (cat[num] < cat[num - 1]) {
                    int memory = cat[num];
                    cat[num] = cat[num - 1];
                    cat[num - 1] = memory;
                    result = true;
                }
            }
        }

        System.out.println(Arrays.toString(cat));
        System.out.println("Колличество перестановок: " + count);

    }
}
