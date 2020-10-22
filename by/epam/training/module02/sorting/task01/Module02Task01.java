package by.epam.training.module02.sorting.task01;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

import java.util.Arrays;

public class Module02Task01 {
    public static void main(String[] args) {
        int k = 3;
        int count = 0;
        int[] hulk = new int[]{6, 5, 3, 1, 2, 9};
        int[] thor = new int[]{7, 3, 0, 6};

        int[] sum = new int[(hulk.length + thor.length)];

        for (int i = 0; i < sum.length; i++) {
            if ((k) > i) {
                sum[i] = hulk[i];
            } else if (count < k) {
                sum[i] = thor[count];
                count++;
            } else
                sum[i] = hulk[i - k - 1];
        }
        System.out.println(Arrays.toString(sum));
    }
}
