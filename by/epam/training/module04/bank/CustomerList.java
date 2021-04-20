package by.epam.training.module04.bank;

import java.util.ArrayList;

public class CustomerList {

    private ArrayList<Customer> customerList;

    public CustomerList() {
        super();

        ArrayList<Customer> customerList = new ArrayList<Customer>();

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

    public CustomerList(ArrayList<Customer> customerList) {
        super();
        this.customerList = customerList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "customerList=" + customerList + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerList == null) ? 0 : customerList.hashCode());
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
        CustomerList other = (CustomerList) obj;
        if (customerList == null) {
            if (other.customerList != null)
                return false;
        } else if (!customerList.equals(other.customerList))
            return false;
        return true;
    }

}