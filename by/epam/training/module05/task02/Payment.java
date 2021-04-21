package by.epam.training.module05.task02;

import java.util.ArrayList;

public class Payment {

    private static int id;
    private ArrayList<Product> list;
    private double totalPrice;

    {
        id++;
        list = new ArrayList<Product>();
    }

    public Payment() {
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



    public class Product {
        private String name;
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
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            long temp;
            temp = Double.doubleToLongBits(price);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            result = prime * result + ((name == null) ? 0 : name.hashCode());
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
            Product other = (Product) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        private Payment getEnclosingInstance() {
            return Payment.this;
        }

        @Override
        public String toString() {
            return "Покупка [Товар: " + name + ", Цена: " + price + "]";
        }
    }

}
