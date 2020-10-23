package by.epam.training.module02.sorting.task03;

//Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;

public class Module02Task03 {
    public static void main(String[] args) {
        int[] newArray = new int[]{3, 8, 12, 15, 18, 22};
        sorting(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static void sorting(int[] array) {
        int tmp = 0;

        for (int count = 0; count < array.length; count++) {
            int maxInd = count;
            for (int i = count; i < array.length; i++) {
                if (array[i] > array[maxInd]) {
                    maxInd = i;
                }
            }
            tmp = array[count];
            array[count] = array[maxInd];
            array[maxInd] = tmp;
        }
    }
}