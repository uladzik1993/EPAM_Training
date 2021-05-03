package by.epam.training.module05.task02;

import java.util.ArrayList;
import java.util.Objects;

public class Payment {

    private static int id;
    private final ArrayList<Product> list = new ArrayList<>();
    private double totalPrice;

    public Payment() {
        id++;
    }

    public void add (String name, double price) {
        Product product = new Product(name, price);
        this.list.add(product);
        totalPrice += price;
    }

    public void remove(int index) {
        this.totalPrice -= this.list.get(index).getPrice();
        this.list.remove(index);
    }

    public int getId () {
        return id;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static class Product {
        private final String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        @Override
        public String toString() {
            return "Покупка [Товар: " + name + ", Цена: " + price + "]";
        }
    }

}
