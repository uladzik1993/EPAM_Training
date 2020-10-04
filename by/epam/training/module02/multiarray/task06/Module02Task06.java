package by.epam.training.module02.multiarray.task06;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//      1 1 1 ... 1 1 1
//      0 1 1 ... 1 1 0
//      0 0 1 ... 1 0 0
//      . . .  .  . . .
//      0 1 1 ... 1 1 0
//      1 1 1 ... 1 1 1

public class Module02Task06 {

    public static void main(String[] args) {

        int n = 6;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - i - 1; j < i + 1; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
