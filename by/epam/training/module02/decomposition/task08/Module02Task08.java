package by.epam.training.module02.decomposition.task08;

// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех
// последовательно расположенных элементов массива с номерами от k до m.

public class Module02Task08 {
    public static void main(String[] args) {
        int k = 4;
        int m = 7;
        int[] d = new int[10];
        int sum = 0;

        System.out.print("Задан массив: ");
        for (int i = 0; i< d.length; i++){
            d[i] = (int)(Math.random()*100);
            System.out.print(d[i]+ " ");
        }

        System.out.println();
        System.out.println("Сумма элементов от " + k + " до " + m + " равна: ");

        for (int i=k-1;i<m;i++) {
            sum += d[i];
        }
        System.out.println(sum);


    }


}
