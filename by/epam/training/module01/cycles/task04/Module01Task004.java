package by.epam.training.module01.cycles.task04;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Module01Task004 {

    public static void main(String[] args) {

        int N = 200;
        long sum = 1;

        for (int i = 1; i <= N; i++) {

            if (sum >= Long.MAX_VALUE) {
                System.out.println("Переполнение примитивного типа данных");
                break;

            } else {

                long info = sum;
                sum = (long) ((sum * Math.pow(i, 2)));

                System.out.println(info + " умножить на " + i + " в квадрате, равно: " + sum);
            }
        }
    }
}
