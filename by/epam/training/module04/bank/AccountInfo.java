package by.epam.training.module04.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountInfo {

    public static List<Account> selectByNumber(int accountNo, AccountList accountList) {
        List<Account> accList = new ArrayList<>();

        for (Account account : accountList.getAccountList()) {
            if (account.getId() == accountNo) {
                accList.add(account);
            }
        }
        return accList;
    }

    public static List<Account> sortByNumber(List<Account> accounts) {
        Account[] result = new Account[accounts.size()];

        for (int i = 0; i < accounts.size(); i++) {
            result[i] = accounts.get(i);
        }
        boolean sort = false;
        Account temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < result.length-1; i++) {
                if (result[i].getId() > result[i + 1].getId()) {
                    temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    sort = false;
                }
            }
        }
        return new ArrayList<>(Arrays.asList(result));
    }

    public static int getSumOfAccounts(List<Account> accounts) {
        int sum = 0;

        for (Account account : accounts) {
            sum += account.getAmount();
        }
        return sum;
    }

    public static int getSumOfPositiveAccounts(List<Account> accounts) {
        int sum = 0;

        for (Account account : accounts) {
            if (account.getAmount() > 0) {
                sum += account.getAmount();
            }
        }
        return sum;
    }

    public static int getSumOfNegativeAccounts(List<Account> accounts) {
        int sum = 0;

        for (Account account : accounts) {
            if (account.getAmount() < 0) {
                sum += account.getAmount();
            }
        }
        return sum;
    }
}
