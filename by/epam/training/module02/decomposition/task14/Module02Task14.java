package by.epam.training.module02.decomposition.task14;

// Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

import java.util.Arrays;

public class Module02Task14 {
    public static void main(String[] args) {
        int k = 1000;

        checkIfAmstrong(k);

    }

    private static void checkIfAmstrong(int userNumber) {
        int remainder = 0;
        int originalNumber = userNumber;
        for (int i = 1; i <= userNumber; i++) {
            int rate = 0;
            originalNumber = i;
            while (originalNumber != 0) {
                originalNumber /= 10;
                rate++;
            }

            int number = i;
            int result = 0;

            while (number != 0) {
                remainder = number % 10;
                result += Math.pow(remainder, rate);
                number /= 10;
            }
            if (result == i)
                System.out.println("Найдено число Амстронга: " + i);
        }
    }
}
