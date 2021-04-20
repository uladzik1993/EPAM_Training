package by.epam.training.module04.bank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AccountInfo {

    public static ArrayList<Account> selectByNumber(int accountNo, AccountList accountList) {
        ArrayList<Account> accList = new ArrayList<Account>();

        for (Account account : accountList.getAccountList()) {
            if (account.getId() == accountNo) {
                accList.add(account);
            }
        }
        return accList;
    }

    public static ArrayList<Account> sortByNumber(ArrayList<Account> accountList) {
        Account[] accs = new Account[accountList.size()];

        for (int i = 0; i < accountList.size(); i++) {
            accs[i] = accountList.get(i);
        }
        boolean sort = false;
        Account temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < accs.length-1; i++) {
                if (accs[i].getId() > accs[i + 1].getId()) {
                    temp = accs[i];
                    accs[i] = accs[i + 1];
                    accs[i + 1] = temp;
                    sort = false;
                }
            }
        }
        ArrayList<Account> sorted = new ArrayList<Account>(Arrays.asList(accs));
        return sorted;
    }

    public static int sumOfAccounts(ArrayList<Account> accountList) {

        int sum = 0;

        for (Account a : accountList) {
            sum += a.getAmount();
        }

        return sum;
    }

    public static int sumOfPositiveAccounts(ArrayList<Account> accountList) {

        int sum = 0;

        for (Account a : accountList) {
            if (a.getAmount() > 0) {
                sum += a.getAmount();
            }
        }

        return sum;

    }

    public static int sumOfNegativeAccounts(ArrayList<Account> accountList) {

        int sum = 0;

        for (Account a : accountList) {
            if (a.getAmount() < 0) {
                sum += a.getAmount();
            }
        }

        return sum;

    }
}
