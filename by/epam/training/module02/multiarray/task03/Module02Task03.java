package by.epam.training.module02.multiarray.task03;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Module02Task03 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {9, 6, 9, 15, 8},
                {10, 8, 8, 3, 4},
                {9, 9, 4, 12, 14},
                {14, 32, 9, 7, 17},
                {1, 8, 7, 12, 8}};

        int str = 4;
        int row = 1;

        System.out.println("Строка № " + str + ": ");

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[str][i] + " ");
        }

        System.out.println();
        System.out.println("Столбец № " + row + ": ");

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[i][row]);
        }
    }
}
