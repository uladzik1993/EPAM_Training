package by.epam.training.module02.multiarray.task01;

// Дана матрица. Вывести на экран все нечетные столбцы,
// у которых первый элемент больше последнего.

public class Module02Task01 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {2, 6, 9, 14, 8},
                {10, 3, 8, 3, 11},
                {12, 9, 4, 10, 14},
                {14, 15, 9, 7, 17},
                {1, 8, 7, 12, 6}};

        System.out.println("Из данного массива:");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }

        for (int i = 1; i < matrix[0].length; i += 2) {
            if (matrix[0][i] > matrix[matrix[0].length - 1][i]) {
                System.out.println("Всем условиям удовлетворяет столбец №:" + i);
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.println(matrix[j][i]);
                }
            }

        }
    }
}
