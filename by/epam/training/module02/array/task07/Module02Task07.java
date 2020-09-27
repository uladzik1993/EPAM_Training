package by.epam.training.module02.array.task07;

//Даны действительные числа. Найти (a1 + a2n, a2 + a2n-1...,an+an+1)

public class Module02Task07 {

    public static void main(String[] args) {

        int[] mass = new int[]{34, 22, 43, 78, 23, 41, 12, 2};
        int n = mass.length - 1;
        int sum = mass[0] + mass[n];
        int max = sum;

        for (int i = 1; i < n / 2; i++) {
            sum = mass[i] + mass[i - 1];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);

    }
}
