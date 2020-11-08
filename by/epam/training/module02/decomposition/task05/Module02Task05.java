package by.epam.training.module02.decomposition.task05;

// Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива,
// но больше всех других элементов).

import by.epam.training.module02.sorting.task03.Module02Task03;

public class Module02Task05 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];

        randArray(a);
        displayArray(a);
        secondMax(a);

    }

    public static void randArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
    }

    public static void displayArray(int[] array) {
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void secondMax(int[] array) {
        Module02Task03.sorting(array);
        if (array.length < 2) {
            System.out.println("В массиве один элемент: " + array[0]);
        } else {
            System.out.println("Второй по величине элемент массива: " + array[array.length - 2]);
        }
    }
}
