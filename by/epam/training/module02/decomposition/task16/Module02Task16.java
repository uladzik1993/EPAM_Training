package by.epam.training.module02.decomposition.task16;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Module02Task16 {
    public static void main(String[] args) {
        System.out.println("Начнем поиск чисел содержащих только не четные числа!");
        int limit = enter("Введите ограничение для поиска:");
        int sum = 0;
        int evenNumber = 0;
        System.out.println("Сумма чисел содержащих только нечетные цифры равна: " + sumOfUnevenNumbers(limit));
        System.out.println("Колличество четных цифр в найденной сумме: " + countEven(sumOfUnevenNumbers(limit)));
    }

    public static void sumOfUneven(int userLimit) {

    }

    static boolean checkUneven(int number) {
        int part = 0;
        boolean result = false;
        while (number != 0) {
            part = number % 10;
            number /= 10;
            if (uneven(part)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    static int countEven(int number) {
        int part = 0;
        int count = 0;
        while (number != 0) {
            part = number % 10;
            number /= 10;
            if (part > 0) {
                if (even(part)) {
                    count++;
                }
            }
        }

        return count;
    }

    static boolean uneven(int a) {
        return (a % 2 != 0);
    }

    static boolean even(int a) {
        return (a % 2 == 0);
    }

    static int sumOfUnevenNumbers(int userLimit) {
        int sum = 0;
        for (int num = 1; num <= userLimit; num++) {
            if (checkUneven(num)) {
                sum += num;
            }
        }
        return sum;
    }
    public static int enter(String massage) {
        System.out.println(massage);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введенные данные не являются натуральным числом. Повторите ввод:");
        }
        return scanner.nextInt();
    }
}
