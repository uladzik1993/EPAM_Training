package by.epam.training.module02.multiarray.task16;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.

import by.epam.training.module02.multiarray.task13.Tool;

public class Module02Task16 {
    public static void main(String[] args) {
        int n = 3;
        int[][] magicSquare = new int[n][n];
        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;
                if (i < 0)
                    i = n - 1;
            }
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                magicSquare[i][j] = num++;
            j++;
            i--;
        }

        System.out.println("Размер магического квадрата " + n + ":");
        System.out.println("Сумма строк или столбца " + n * (n * n + 1) / 2 + ":");

        Tool.printArray(magicSquare);
        }
    }