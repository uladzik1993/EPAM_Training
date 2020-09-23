package by.epam.training.module02.array.task01;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Module02Task01 {

    public static void main(String[] args) {

        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 3;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }

        System.out.println(sum);
    }
}

