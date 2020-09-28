package by.epam.training.module02.array.task10;

// Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй
// элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Module02Task10 {

    public static void main(String[] args) {

        int[] mass = new int[]{3, 7, 15, 11, 19, 33, 20};

        for (int i = 1; i < mass.length; i += 2) {
            mass[i] = 0;
        }
        System.out.println(Arrays.toString(mass));
    }

}
