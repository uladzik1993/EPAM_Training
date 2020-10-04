package by.epam.training.module02.multiarray.task07;

// Сформировать квадратную матрицу порядка N по правилу:
// A [I, J] = sin(I(2) - J(2) / N)
// и подсчитать количество положительных элементов в ней.

public class Module02Task07 {

    public static void main(String[] args) {

        int positiveNum = 0;
        int N = 6;
        double[][] matrix = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / N);
                if (matrix[i][j] > 0) {
                    positiveNum++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%7.2f",matrix [i][j]);
            }
            System.out.println();
        }

        System.out.println("Количество положительных элементов в матрице: " + positiveNum);

            }
        }
