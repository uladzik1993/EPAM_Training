package by.epam.training.module04.bank;

import java.util.Objects;

public class Customer {

    private int id;
    private String surName;
    private String firstName;
    private String patronymic;
    private String address;
    private AccountList accountList = new AccountList();

    public Customer() {
    }

    public Customer(int id, String surName, String firstName, String patronymic, String address,
                    AccountList accountList) {
        this.id = id;
        this.surName = surName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.accountList = accountList;
    }

    public int getId() {
        return id;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public AccountList getAccountList() {
        return accountList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(surName, customer.surName)
                && Objects.equals(firstName, customer.firstName) && Objects.equals(patronymic, customer.patronymic)
                && Objects.equals(address, customer.address) && Objects.equals(accountList, customer.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surName, firstName, patronymic, address, accountList);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "id=" + id + ", surName=" + surName + ", firstName=" + firstName
                + ", patronymic=" + patronymic + ", address=" + address + ", accountList=" + accountList + "]";
    }

}
