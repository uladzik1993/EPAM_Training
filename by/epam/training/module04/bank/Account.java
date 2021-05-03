package by.epam.training.module04.bank;

import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public class Account {

    private int id;
    private int ownerID;
    private Locale locale;
    private Currency currency;
    private int amount;
    private boolean blockStatus;

    public Account() {
        this.locale = Locale.US;
        this.currency = Currency.getInstance(locale);
        new Account(id);
    }

    public Account(int id) {
        this.id = id;
        this.locale = Locale.US;
        this.amount = 0;
        this.blockStatus = false;
        this.currency = Currency.getInstance(locale);
    }

    public Account(Locale locale,int amount, int ownerID, boolean blockStatus, int id) {
        this.locale = locale;
        this.amount = amount;
        this.ownerID = ownerID;
        this.blockStatus = blockStatus;
        this.id = id;
        this.currency = Currency.getInstance(locale);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(boolean blockStatus) {
        this.blockStatus = blockStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && ownerID == account.ownerID && amount == account.amount
                && blockStatus == account.blockStatus && Objects.equals(locale, account.locale)
                && Objects.equals(currency, account.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerID, locale, currency, amount, blockStatus);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "accNumber=" + id + ", ownerId=" + ownerID + ", locale=" + locale
                + ", currency=" + currency + ", amount=" + amount + ", isBlockedStatus=" + blockStatus + "]";
    }

}
