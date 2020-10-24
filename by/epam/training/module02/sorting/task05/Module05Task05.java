package by.epam.training.module02.sorting.task05;

//Сортировка вставками. Дана последовательность чисел a1, a2,...an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1, a2,...ai - упорядоченная последовательность, т. е.
//a1<=a2<=...<=an. Берется следующее число a(i+1) a и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class Module05Task05 {
    public static void main(String[] args) {

        int[] newArray = new int[]{7, 9, 2, 4, 2, 6, 37, 34};

        insertSort(newArray);
        System.out.println(Arrays.toString(newArray));

    }

    public static void insertSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
}
