package by.epam.training.module02.multiarray.task04;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//    1   2   3   ...   n
//    n  n-1 n-2  ...   1
//    1   2   3   ...   n
//    n  n-1 n-2  ...   1
//   ... ... ...  ...  ...
//    n  n-1 n-2  ...   1

public class Module02Task04 {

    public static void main(String[] args) {

        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix[0].length; i += 2) {
            for (int u = 0; u < matrix[0].length; u++)
                matrix[i][u] = u + 1;
        }

        for (int i = 1; i < matrix[0].length; i += 2) {
            for (int u = 0; u < matrix[0].length; u++) {
                matrix[i][u] = matrix[0].length - u;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();

        }
    }
}
