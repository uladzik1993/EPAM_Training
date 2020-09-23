package by.epam.training.module01.cycles.task03;

//Найти сумму квадратов первых ста чисел.

public class Module01Task03 {

    public static void main(String[] args) {

        double sum = 0;
        int N = 100;

        for (int x = 1; x <= N; x++) {
            sum = sum + Math.pow(x, 2);
        }

        System.out.println(sum);
    }
}