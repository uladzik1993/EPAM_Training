package by.epam.training.module02.multiarray.task12;

import java.util.Arrays;
import java.util.Random;

public class Sort {

    public void sotrtMin(int[][] matrix) {

        for (int x = 0; x < matrix[0].length; x++) {
            for (int j = matrix[0].length - 1; j > 0; j--) {
                for (int i = 0; i < j; i++) {
                    if (matrix[x][i] > matrix[x][i + 1]) {
                        int tmp = matrix[x][i];
                        matrix[x][i] = matrix[x][i + 1];
                        matrix[x][i + 1] = tmp;
                    }
                }
            }
        }
    }

    public void sotrtMax(int[][] matrix) {

        for (int x = 0; x < matrix[0].length; x++) {
            for (int j = matrix[0].length - 1; j > 0; j--) {
                for (int i = 0; i < j; i++) {
                    if (matrix[x][i] < matrix[x][i + 1]) {
                        int tmp = matrix[x][i];
                        matrix[x][i] = matrix[x][i + 1];
                        matrix[x][i + 1] = tmp;
                    }
                }
            }
        }
    }
}
