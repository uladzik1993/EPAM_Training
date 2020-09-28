package by.epam.training.module02.multiarray.task05;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//  1   1   1   ...   1   1   1
//  2   2   2   ...   2   2   0
//  3   3   3   ...   3   0   0
//  .   .   .   ...   .   .   .
//  n  n-1 n-1  ...   0   0   0
//  n   0   0   ...   0   0   0

public class Module02Task05 {

    public static void main(String[] args) {

        int n = 6;
        int limit = n;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int y = 0; y < limit; y++) {
                matrix[i][y] = n + 1;
            }
            limit--;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}