package by.epam.training.module02.multiarray.task16;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.

import by.epam.training.module02.multiarray.task13.Tool;

public class Module02Task16 {
    public static void main(String[] args) {
        int n = 3;
        int sumColumn = 0;
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        boolean result = true;
        int[][] magicCube = new int[n][n];
        Tool.randArray(magicCube);
        Tool.printArray(magicCube);


        while (result) {
            Tool.randArray(magicCube);

            for (int str = 0; str < magicCube.length; str++) {
                sumColumn += magicCube[str][0];
            }

            for (int str = 0; str < magicCube.length; str++) {
                sumDiag1 += magicCube[str][str];
            }

            for (int str = 0; str < magicCube.length; str++) {
                sumDiag2 += magicCube[str][magicCube.length - 1 - str];
            }
            if ((sumColumn == sumDiag1) == (sumColumn == sumDiag2)) {
                result = false;
            }
        }
        System.out.println();
        Tool.printArray(magicCube);
        System.out.println();
        System.out.println(sumColumn + " " + sumDiag1 + " " + sumDiag2);
        System.out.println(result);
    }
}
