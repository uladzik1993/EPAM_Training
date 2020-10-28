package by.epam.training.module02.sorting.task06;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai, a(i+1). Если ai <= a(i+1), то продвигаются
//на один элемент вперед. Если ai>a(i+1), то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

import java.util.Arrays;

public class Module02Task06 {
    public static void main(String[] args) {

        int n = 12;
        int[] array = new int[n];
        randArray(array);
        System.out.println("Массив до сортировки: ");
        printArray(array);
        System.out.println();
        System.out.println("Массив после сортировки: ");
        shellSort(array);
        printArray(array);
    }

    public static void printArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public  static void randArray(int[]arr){
        for (int i=0;i< arr.length;i++){
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void shellSort(int[] array) {
        int d = array.length / 2;
        while (d > 0) {
            for (int i = 0; i < (array.length - d); i++) {
                int j = i;
                while ((j >= 0) && (array[j] > array[j + d])) {
                    int tmp = array[j];
                    array[j] = array[j + d];
                    array[j + d] = tmp;
                    j--;
                }
            }
            d = d / 2;
        }
    }
}
