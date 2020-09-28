package by.epam.training.module02.multiarray.task02;

// Дана квадратная матрица.
// Вывести на экран элементы, стоящие на диагонали.

import java.util.Random;

public class Module02Task02 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int y = 0; y < matrix[0].length; y++) {
                matrix[i][y] = rand.nextInt(10);
            }
        }

        System.out.println("Рожден массив: ");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int y = 0; y < matrix[0].length; y++) {
                System.out.print(matrix[i][y] + "\t");
            }
            System.out.println();
        }

        System.out.println("Элементы стоящие на диагонали 1: ");

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[i][i]);
        }

        System.out.println("Элементы стоящие на диагонали 2: ");

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[i][matrix[0].length - 1 - i]);
        }
    }
}
