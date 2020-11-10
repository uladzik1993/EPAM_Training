package by.epam.training.module02.decomposition.task13;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.

import by.epam.training.module02.decomposition.task08.Module02Task08;

public class Module02Task13 {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[10];

        Module02Task08.randArray(array);
        Module02Task08.printArray(array);

        System.out.println();

        printTwins(n - 1, 2 * n, array);
    }

    public static void printTwins(int start, int end, int[] array) {
        for (int i = start; i < end; i++) {
            int tmp = array[i];
            for (int y = i + 1; y < end; y++) {
                int count = 0;
                if (tmp > array[y]) {
                    count = tmp - array[y];
                    if (count == 2) {
                        System.out.println("Пара чисел близнецов найдена: " + tmp + " " + array[y]);
                    }
                } else {
                    count = array[y] - tmp;
                    if (count == 2) {
                        System.out.println("Пара чисел близнецов найдена: " + tmp + " " + array[y]);
                    }
                }
            }
        }

    }
}
