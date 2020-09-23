package by.epam.training.module01.cycles.task04;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

//Вариант решения задания с применением BigDecimal.

import java.math.BigDecimal;

public class Module01Task04 {

    public static void main(String[] args) {

        int N = 200;
        int[] array = new int[N];

        for (int i = 1, z = 0; i <= N; i++, z++) {
            array[z] = i * i;
        }

        BigDecimal sum = BigDecimal.ONE;
        for (int i = 0; i < N; i++) {
            sum = sum.multiply(BigDecimal.valueOf(array[i]));
        }

        System.out.println(sum);
    }
}
