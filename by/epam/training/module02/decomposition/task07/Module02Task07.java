package by.epam.training.module02.decomposition.task07;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Module02Task07 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Факториал всех нечетных чисел от 1 до " + n + " равен " + sumFactorial(n));

    }

    static long factorial(int a) {
        long f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    static long sumFactorial(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }
}
