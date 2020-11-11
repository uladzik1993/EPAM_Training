package by.epam.training.module02.decomposition.task15;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

import by.epam.training.module02.sorting.task06.Module02Task06;

import java.util.Arrays;

public class Module02Task15 {
    public static void main(String[] args) {
        int number = 130;


        int part = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                tmp /= 10;
                count++;
            }
            tmp = i;
            int[] mass = new int[count];
            int cell = 0;
            while (tmp != 0) {
                part = tmp % 10;
                tmp /= 10;
                mass[cell] = part;
                cell++;
            }
            if (count > 1) {
                Module02Task06.shellSort(mass);
                boolean flag = almostIncreasingSequence(mass);
                if (flag) {
                    System.out.println(Arrays.toString(mass));
                }
            }
        }
    }

    private static boolean almostIncreasingSequence(int[] sequence) {
        int max = Integer.MIN_VALUE, count = 0;
        boolean flag = true;
        for (int j = 0; j < sequence.length; j++) {
            if (max >= sequence[j]) {
                count++;
            } else
                max = sequence[j];
            if (count > 1) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

