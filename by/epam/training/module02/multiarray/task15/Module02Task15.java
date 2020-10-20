package by.epam.training.module02.multiarray.task15;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import by.epam.training.module02.multiarray.task13.Tool;

public class Module02Task15 {
    public static void main(String[] args) {
        int[][] ironMan = new int[5][5];
        int max = 0;

        Tool.randArray(ironMan);
        System.out.println("Сгенерированный массив: ");
        Tool.printArray(ironMan);

        for (int clmb = 0; clmb < ironMan.length; clmb++) {
            for (int str = 0; str < ironMan.length; str++)
                if (ironMan[clmb][str] > max) {
                    max = ironMan[clmb][str];
                }
        }

        for (int clmb = 0; clmb < ironMan.length; clmb++) {
            for (int str = 0; str < ironMan.length; str++)
                if (ironMan[clmb][str] % 2 != 0) {
                    ironMan[clmb][str] = max;
                }
        }

        System.out.println();
        System.out.println("Заменим все нечетные эл-ты на максимальный эллемент массива (max = " + max + ")");
        Tool.printArray(ironMan);
    }
}

