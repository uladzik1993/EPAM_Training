package by.epam.training.module05.task02;

// Создать класс Payment с внутренним классом, с помощью объектов которого
// можно сформировать покупку из нескольких товаров.

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.add("book", 50);
        payment.add("computer", 1270);
        payment.add("headphones", 148);

        View.printPayment(payment);

        payment.remove(1);

        View.printPayment(payment);
    }
}
