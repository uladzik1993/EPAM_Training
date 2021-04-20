package by.epam.training.module04.bank;

import java.util.ArrayList;

public class View {

    // метод, который будет печатать результат выполнения метода selectByNumber

    public static void printSelectedByNumber(int accountNo, AccountList accountList) {

        System.out.println("Счет с указанным номером");

        ArrayList<Account> selected_accList = AccountInfo.selectByNumber(accountNo, accountList);
        System.out.printf("%-15s%-15s%-15s", "Номер счёта", "Сумма на счёте", "Статус блокировки");
        System.out.println("");

        // вывод на печать коллекции ArrayList

        for (Account a : selected_accList) {
            System.out.printf("%-15s%-15s%-15s", a.getId(), a.getAmount(), a.isBlockStatus());
        }
    }

    public static void printSortedByNumber(ArrayList<Account> accounts) {

        ArrayList<Account> selected_accList = AccountInfo.sortByNumber(accounts);

        System.out.println("\nСчета, отсортированные по номеру: ");

        System.out.printf("%-15s%-15s%-15s", "Номер счёта", "Сумма на счёте", "Статус блокировки\n");

        for (Account a : selected_accList) {
            System.out.printf("%-15s%-15s%-15s%n", a.getId(), a.getAmount(), a.isBlockStatus());
        }

    }

    public static void printSumOfAllAccounts(ArrayList<Account> accounts) {

        System.out.println("\nСумма денежных средств на всех счетах: " + AccountInfo.sumOfAccounts(accounts) + " "
                + accounts.get(0).getCurrency());

    }

    public static void printSumOfPositiveAccounts(ArrayList<Account> accounts) {

        System.out.println("\nСумма денежных средств на счетах с положительным балансом: "
                + AccountInfo.sumOfPositiveAccounts(accounts) + " " + accounts.get(0).getCurrency());

    }

    public static void printSumOfNegativeAccounts(ArrayList<Account> accounts) {

        System.out.println("\nСумма денежных средств на счетах с отрицательным балансом: "
                + AccountInfo.sumOfNegativeAccounts(accounts) + " " + accounts.get(0).getCurrency());

    }

}
