package by.epam.training.module04.tourist;

public class View {

    public void print(Offer offer) {
        System.out.println("Selected offer:");
        for(Agency t : offer.getList()) {
            System.out.println(t.toString());
        }
        System.out.println("");
    }

}
