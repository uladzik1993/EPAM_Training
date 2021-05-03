package by.epam.training.module05.task02;

public class View {

    public static void printPayment(Payment payment) {
        System.out.println("Номер покупки " + payment.getId());
        for (Payment.Product product : payment.getList()) {
            System.out.println(product.toString());
        }
        System.out.println("Итого: " + payment.getTotalPrice());
    }
}
