package by.epam.training.module04.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class AccountList {

    private List<Account> accountList;

    public AccountList() {
        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account(Locale.US, -12415, 234845353, false, 3274569));
        accountList.add(new Account(Locale.US, 10000, 244535433, false, 3482617));
        accountList.add(new Account(Locale.US, 1241455, 794128148, false, 1312439));
        accountList.add(new Account(Locale.US, 105342, 997656434, false, 1028987));
        accountList.add(new Account(Locale.US, 167892, 343943738, false, 7674323));
        accountList.add(new Account(Locale.US, 28904, 543412148, false, 1010103));
        accountList.add(new Account(Locale.US, -6905, 116000000, true, 3433432));
        this.accountList = accountList;
    }

    public AccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountList that = (AccountList) o;
        return Objects.equals(accountList, that.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountList);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "accountList=" + accountList + "]";
    }

}
