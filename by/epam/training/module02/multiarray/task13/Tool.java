package by.epam.training.module02.multiarray.task13;

import java.util.Random;

public class Tool {

    // Рандомный массив от 0 до 9
    public static void randArray(int[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }
    }

    //Вывод массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Сортировка столбцов по возрастанию
    public static void sotrtMax(int[][] array) {

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                for (int i = y + 1; i < array.length; i++) {
                    if (array[y][x] > array[i][x]) {
                        int tmp = array[y][x];
                        array[y][x] = array[i][x];
                        array[i][x] = tmp;
                    }
                }
            }
        }
    }

    //Сортировка столбцов по убыванию
    public static void sotrtMin(int[][] array) {

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                for (int i = y + 1; i < array.length; i++) {
                    if (array[y][x] < array[i][x]) {
                        int tmp = array[y][x];
                        array[y][x] = array[i][x];
                        array[i][x] = tmp;
                    }
                }
            }
        }
    }
}
