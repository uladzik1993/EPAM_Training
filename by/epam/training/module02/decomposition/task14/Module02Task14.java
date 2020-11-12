package by.epam.training.module02.decomposition.task14;

// Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Module02Task14 {
    public static void main(String[] args) {
        int k = 1000;

        processNumbers(k);
    }

    private static void processNumbers(int userNumber) {
        for (int i = 1; i <= userNumber; i++) {
            if (checkIfArmstrong(i)) {
                System.out.println("Найдено число Амстронга: " + i);
            }
        }
    }

    private static boolean checkIfArmstrong(int i) {
        int originalNumber = i;
        int remainder;
        int rate = 0;

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
        return result == i;
    }
}
