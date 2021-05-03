package by.epam.training.module04.tourist;

public class View {

    public static void printOffers(Agency offers) {
        System.out.println("Selected offer:");

        for(Offer offer : offers.getOffers()) {
            System.out.println(offer.toString());
        }
        System.out.println();
    }

}
