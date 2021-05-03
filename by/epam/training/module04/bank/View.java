package by.epam.training.module04.bank;

import java.util.List;

public class View {

    // метод, который будет печатать результат выполнения метода selectByNumber

    public static void printSelectedByNumber(int accountNo, AccountList accountList) {

        System.out.println("Счет с указанным номером");

        List<Account> sortedAccounts = AccountInfo.selectByNumber(accountNo, accountList);
        System.out.printf("%-15s%-15s%-15s", "Номер счёта", "Сумма на счёте", "Статус блокировки");
        System.out.println("");

        for (Account account : sortedAccounts) {
            System.out.printf("%-15s%-15s%-15s", account.getId(), account.getAmount(), account.isBlockStatus());
        }
    }

    public static void printSortedByNumber(List<Account> accounts) {

        //List<Account> selected_accList = AccountInfo.sortByNumber(accounts); // это оч плохое имя для листа, ваще не по джава конвеншн
        List<Account> sortedAccounts = AccountInfo.sortByNumber(accounts);

        System.out.println("\nСчета, отсортированные по номеру: ");

        System.out.printf("%-15s%-15s%-15s", "Номер счёта", "Сумма на счёте", "Статус блокировки\n");

        for (Account account : sortedAccounts) {
            System.out.printf("%-15s%-15s%-15s%n", account.getId(), account.getAmount(), account.isBlockStatus());
        }

    }

    public static void printSumOfAllAccounts(List<Account> accounts) {

        System.out.println("\nСумма денежных средств на всех счетах: " + AccountInfo.getSumOfAccounts(accounts) + " "
                + accounts.get(0).getCurrency());

    }

    public static void printSumOfPositiveAccounts(List<Account> accounts) {

        System.out.println("\nСумма денежных средств на счетах с положительным балансом: "
                + AccountInfo.getSumOfPositiveAccounts(accounts) + " " + accounts.get(0).getCurrency());

    }

    public static void printSumOfNegativeAccounts(List<Account> accounts) {

        System.out.println("\nСумма денежных средств на счетах с отрицательным балансом: "
                + AccountInfo.getSumOfNegativeAccounts(accounts) + " " + accounts.get(0).getCurrency());
    }

}
