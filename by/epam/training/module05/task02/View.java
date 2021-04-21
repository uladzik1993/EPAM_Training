package by.epam.training.module05.task02;

public class View {
    public static void printPurchase(Payment payment) {
        System.out.println("Номер покупки " + payment.getId());
        for (Payment.Product p : payment.getList()) {
            System.out.println(p.toString());
        }
        System.out.println("Итого: " + payment.getTotalPrice());
    }
}
