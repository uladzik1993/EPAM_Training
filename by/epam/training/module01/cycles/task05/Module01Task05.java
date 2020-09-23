package by.epam.training.module01.cycles.task05;

// Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда,
// модуль которых больше или равен заданному е.

public class Module01Task05 {

    public static void main(String[] args) {

        double e = 0.8;
        double sum = 0;
        int n = 10;
        double a;

        for (int i = 1; i < n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum = sum + a;
            }
        }

        System.out.println("Сумма членов ряда модуль которых больше или равен " + e + " равна " + sum);

    }
}
