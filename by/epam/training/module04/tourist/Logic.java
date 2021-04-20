package by.epam.training.module04.tourist;

public class Logic {


    public Offer selectOfferByEnum(Offer offer, Type.transportation transport) {

        Offer off = new Offer();
        off.setType(offer.getType());

        for (Agency a : offer.getList()) {
            if (transport == a.getTransport()) {
                off.add(a);
            }
        }
        return off;
    }

    public Offer selectOfferByEnum(Offer offer, Type.tourType type) {
        Offer off = new Offer();
        off.setType(offer.getType());

        for (Agency a : offer.getList()) {
            if (type == a.getType()) {
                off.add(a);
            }
        }
        return off;
    }

    public Offer selectOfferByEnum(Offer offer, Type.food food) {
        Offer newOffer = new Offer();
        newOffer.setType(offer.getType());

        for (Agency t : offer.getList()) {
            if (food == t.getFood()) {
                newOffer.add(t);
            }
        }
        return newOffer;
    }

    public Offer selectOfferByEnum(Offer offer, Type.destination parametr) {
        Offer newOffer = new Offer();
        newOffer.setType(offer.getType());

        for (Agency t : offer.getList()) {
            if (parametr == t.getDestinition()) {
                newOffer.add(t);
            }
        }
        return newOffer;
    }

    public Offer selectOfferByNumNight(Offer offer, int minNum, int maxNum) {
        Offer newOffer = new Offer();
        newOffer.setType(offer.getType());

        for (Agency t : offer.getList()) {
            if (t.getNumNights() > minNum && t.getNumNights() < maxNum) {
                newOffer.add(t);
            }
        }
        return newOffer;
    }

    public Offer selectOfferByPrice(Offer offer, int minCost, int maxCost) {
        Offer newOffer = new Offer();
        newOffer.setType(offer.getType());

        for (Agency t : offer.getList()) {
            if (t.getPrice() >= minCost && t.getPrice() <= maxCost) {
                newOffer.add(t);
            }
        }
        return newOffer;
    }

}
