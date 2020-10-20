package by.epam.training.module02.multiarray.task14;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Module02Task14 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                matrix[j][i] = 1;
            }
        }
        printArray(matrix);
    }
        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
}