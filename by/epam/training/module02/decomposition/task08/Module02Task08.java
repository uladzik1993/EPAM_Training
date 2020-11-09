package by.epam.training.module02.decomposition.task08;

// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех
// последовательно расположенных элементов массива с номерами от k до m.

public class Module02Task08 {
    public static void main(String[] args) {

        int k = 4;
        int m = 7;
        int[] d = new int[10];

        randArray(d);
        System.out.print("Задан массив: ");
        printArray(d);
        printSum(k, m, d);
    }

    public static void randArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printSum(int start, int end, int[] arr) {
        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Сумма элементов от " + start + " до " + end + " равна: " + sum);
    }
}
