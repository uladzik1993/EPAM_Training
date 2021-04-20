package by.epam.training.module04.bank;

import java.security.acl.Owner;
import java.util.Currency;
import java.util.Locale;

public class Account {

    private int id;
    private int ownerID;
    private Locale locale;
    private Currency currency;
    private int amount;
    private boolean blockStatus;

    public Account() {
        super();
        this.locale = Locale.US;
        this.currency = Currency.getInstance(locale);
        new Account(this.id);
    }

    public Account(int id) {
        this.id = id;
        this.locale = Locale.US;
        this.amount = 0;
        this.blockStatus = false;
        this.currency = Currency.getInstance(locale);
    }

    public Account(Locale locale,int amount, int ownerID, boolean blockStatus, int id) {
        super();
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
    public String toString() {
        return this.getClass().getName() + "accNumber=" + id + ", ownerId=" + ownerID + ", locale=" + locale
                + ", currency=" + currency + ", amount=" + amount + ", isBlockedStatus=" + blockStatus + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + amount;
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + (blockStatus ? 1231 : 1237);
        result = prime * result + ((locale == null) ? 0 : locale.hashCode());
        result = prime * result + ownerID;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (id != other.id)
            return false;
        if (amount != other.amount)
            return false;
        if (currency == null) {
            if (other.currency != null)
                return false;
        } else if (!currency.equals(other.currency))
            return false;
        if (blockStatus != other.blockStatus)
            return false;
        if (locale == null) {
            if (other.locale != null)
                return false;
        } else if (!locale.equals(other.locale))
            return false;
        if (ownerID != other.ownerID)
            return false;
        return true;
    }

}
