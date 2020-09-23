package by.epam.training.module01.cycles.task01;

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа

public class Module01Task01 {

    public static void main(String[] args) {

        int number = EnterInt.enterInt("Введите целое положительное число:");
        int sum = EnterInt.sum(number);

        if (sum <= 0) {
            System.out.println("Error");
        } else System.out.println("Сумма всех чисел от 1 до введенного вами числа : " + sum);
    }
}
