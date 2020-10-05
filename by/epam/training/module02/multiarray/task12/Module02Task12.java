package by.epam.training.module02.multiarray.task12;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;
import java.util.Random;

public class Module02Task12 {

    public static void main(String[] args) {

        int h = 10;
        int l = 10;
        Random rand = new Random();
        int[][] matrix = new int[h][l];


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        
        System.out.println("Массив до сортировки: ");

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < h; i++) {
            Arrays.sort(matrix[i]);
        }

        System.out.println();
        System.out.println("Массив после сортировки: ");

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
