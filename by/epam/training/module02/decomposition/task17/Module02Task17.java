package by.epam.training.module02.decomposition.task17;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Module02Task17 {
    public static void main(String[] args) {
        int number = 89;

        count(number);
    }

    public static void count(int num) {
        int count = 0;

        while (num != 0) {
            int a = num % 10;
            int b = num / 10;
            num = num - (a + b);
            count++;

        }
        System.out.println("Колличество отниманий сумм цифр числа: " + count);
    }
}
