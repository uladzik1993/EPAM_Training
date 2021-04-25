package by.epam.training.module05.task02;

// Создать класс Payment с внутренним классом, с помощью объектов которого
// можно сформировать покупку из нескольких товаров.

public class Main {
    public static void main(String[] args) {
        Payment paymentOne = new Payment();

        paymentOne.add("book", 50);
        paymentOne.add("computer", 1270);
        paymentOne.add("headphones", 148);

        View.printPurchase(paymentOne);

        paymentOne.remove(1);

        View.printPurchase(paymentOne);

    }
}
