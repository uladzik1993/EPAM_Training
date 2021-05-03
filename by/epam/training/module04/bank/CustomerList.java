package by.epam.training.module04.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerList {

    private List<Customer> customerList;

    public CustomerList() {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(103567478, "Степанчук", "Виктор", "Сергеевич", "ул. Школьная, д.2, кв. 33",
                new AccountList()));
        customerList.add(new Customer(678345620, "Иванов", "Константин", "Александрович", "ул. Пушкина, д.7, кв. 10",
                new AccountList()));
        customerList.add(new Customer(789254618, "Ковалевская", "Инна", "Ивановна", "пр. Победителей, д.34, кв.78",
                new AccountList()));
        customerList.add(new Customer(627893517, "Кашкан", "Татьяна", "Викторовна", "ул. Фабричная, д.12, кв. 22",
                new AccountList()));
        customerList.add(new Customer(657828456, "Савицкий", "Игорь", "Сергеевич", "ул. Спортивная, д.2, кв. 17",
                new AccountList()));

        this.customerList = customerList;
    }

    public CustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerList that = (CustomerList) o;
        return Objects.equals(customerList, that.customerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerList);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "customerList=" + customerList + "]";
    }

}