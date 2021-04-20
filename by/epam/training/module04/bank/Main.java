package by.epam.training.module04.bank;

// Счета. Клиент может иметь несколько счетов в банке.
// Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам.
// Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Main {

    public static void main(String[] args) {

        AccountList accountList = new AccountList();
        // счёт с заданным номером

        View.printSelectedByNumber(4329482, accountList);
        // счета, отсортированные в порядке возрастания
        View.printSortedByNumber(accountList.getAccountList());

        // сумма, вычисленная отдельно по всем счетам, счетам с положительным и
        // отрицательным балансом

        View.printSumOfAllAccounts(accountList.getAccountList());

        View.printSumOfNegativeAccounts(accountList.getAccountList());

        View.printSumOfPositiveAccounts(accountList.getAccountList());
    }

}