package by.epam.training.module04.task08;

import java.util.ArrayList;

public class Database {
    private ArrayList<ArrayList<Customer>> base = new ArrayList<>();

    public void saveCustomer (ArrayList<Customer> customer) {
        base.add(customer);
    }
}
