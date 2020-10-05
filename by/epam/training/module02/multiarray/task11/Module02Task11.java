package by.epam.training.module02.multiarray.task11;

// Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в
// которых число 5 встречается три и более раз.

import java.util.Random;

public class Module02Task11 {
    public static void main(String[] args) {

        int h = 10;
        int l = 20;
        Random rand = new Random();
        int[][] matrix = new int[h][l];


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                matrix[i][j] = rand.nextInt(15);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Цифра 5 встречается 3 и более раз в строках: ");

        for (int i = 0; i < h; i++) {
            int five = 0;
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] == 5) {
                    five++;
                    if (five >= 3) {
                        System.out.println("Строка №: " + (i + 1));
                    }
                }
            }
        }
    }
}