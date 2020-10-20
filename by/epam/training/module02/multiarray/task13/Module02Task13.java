package by.epam.training.module02.multiarray.task13;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Module02Task13 {
    public static void main(String[] args) {
        int h = 5;
        int l = 5;
        int[][] matrix = new int[h][l];

        System.out.println("Массив до сортировки: ");
        Tool.randArray(matrix);
        Tool.printArray(matrix);
        System.out.println();

        System.out.println("Массив после сортировки по возрастанию: ");
        Tool.sotrtMax(matrix);
        Tool.printArray(matrix);
        System.out.println();

        System.out.println("Массив после сортировки по убыванию: ");
        Tool.sotrtMin(matrix);
        Tool.printArray(matrix);

    }
}
