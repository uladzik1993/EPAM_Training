package by.epam.training.module02.multiarray.task09;

// Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

public class Module02Task09 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{4, 3, 2},
                                     {1, 6, 3},
                                     {9, 6, 8}};

        int sum = 0;
        int col = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            int s = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                s += matrix[j][i];
                if (s > sum) {
                    sum = s;
                    col = j;
                }
            }
        }

        System.out.println("Максимальная сумма эллементов в столбце №: " + col + " (" + sum + ")");

    }
}
