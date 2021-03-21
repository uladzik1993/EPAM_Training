package by.epam.training.module04.task08;

import java.util.Arrays;

public class CustomerList {
    private  Customer[] customerList;
    private int numberCustomer;

    public CustomerList() {
        super();

        int defaultCustomerNumber = 5;

        Customer[] customerList = new Customer[defaultCustomerNumber];

        customerList[0] = new Customer(12, "Сидоров", "Петр",
                "Михайлович", "г. Жодино", 23139424,
                224132424);
        customerList[1] = new Customer(1, "Степанчук", "Лидия",
                "Андреевна", "г. Витебск", 93827622,
                639572048);
        customerList[2] = new Customer(76, "Федоров", "Александр",
                "Сергеевич", "г. Минск", 38574620,
                118365947);
        customerList[3] = new Customer(44, "Иванов", "Сергей",
                "Сергеевич", "г. Гродно", 38574228,
                387502384);
        customerList[4] = new Customer(87, "Петрухин", "Василий",
                "Иванович", "г. Полоцк", 37522933,
                197284364);

        new CustomerList(customerList, defaultCustomerNumber);

        this.customerList = customerList;
        this.numberCustomer = defaultCustomerNumber;
    }


    public CustomerList(Customer[] customerList, int numberCustomer) {
        super();
        this.customerList = customerList;
        this.numberCustomer = numberCustomer;
    }

    public Customer[] getCustomerList() {
        return customerList;
    }

    public void setCustomerList(Customer[] customerList) {
        this.customerList = customerList;
    }

    public int getNumberCustomer() {
        return numberCustomer;
    }

    public void setNumberCustomer(int numberCustomer) {
        this.numberCustomer = numberCustomer;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "customersLest=" +
                Arrays.toString(customerList) + ", numberCustomer =" +
                numberCustomer + "]";
    }
}
