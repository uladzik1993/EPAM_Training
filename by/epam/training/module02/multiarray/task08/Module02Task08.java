package by.epam.training.module02.multiarray.task08;

// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
// на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры.

import java.util.Random;
import java.util.Scanner;

public class Module02Task08 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N = 6;
        int[][] matrix = new int[N][N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Получилась матрица: ");
        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Укажите номера столбцов которые нужно поменять местами");

        System.out.println("Первый: ");
        int replace1 = scan.nextInt();

        System.out.println("Второй: ");
        int replace2 = scan.nextInt();

        for (int i = 0; i < N; i++) {
                int tmp = matrix[i][replace1 - 1];
                matrix[i][replace1 - 1] = matrix[i][replace2 - 1];
                matrix[i][replace2 - 1] = tmp;
            }

        System.out.println("Вот что получилось: ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
