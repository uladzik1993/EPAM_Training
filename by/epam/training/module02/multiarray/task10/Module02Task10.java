package by.epam.training.module02.multiarray.task10;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Module02Task10 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {9, 4, 6, 7},
                {8, -5, 9, 1},
                {3, 6, 2, 9},
                {4, 6, 2, -1}};

        System.out.println("Положительные элементы главной диагонали матрица: ");

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(" " + matrix[i][i]);
            }
        }
    }
}