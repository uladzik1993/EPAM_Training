package by.epam.training.module04.tourist;

public class OfferService {

    public Agency getOffersByEnumParameter(Agency offers, Type.transportation transport) {
        Agency result = new Agency();
        result.setType(offers.getType());

        for (Offer offer : offers.getOffers()) {
            if (transport == offer.getTransport()) {
                result.add(offer);
            }
        }
        return result;
    }

    public Agency getOffersByEnumParameter(Agency offers, Type.tourType type) {
        Agency result = new Agency();
        result.setType(offers.getType());

        for (Offer offer : offers.getOffers()) {
            if (type == offer.getType()) {
                result.add(offer);
            }
        }
        return result;
    }

    public Agency getOffersByEnumParameter(Agency offers, Type.food food) {
        Agency result = new Agency();
        result.setType(offers.getType());

        for (Offer offer : offers.getOffers()) {
            if (food == offer.getFood()) {
                result.add(offer);
            }
        }
        return result;
    }

    public Agency getOffersByEnumParameter(Agency offer, Type.destination parametr) {
        Agency newOffer = new Agency();
        newOffer.setType(offer.getType());

        for (Offer t : offer.getOffers()) {
            if (parametr == t.getDestination()) {
                newOffer.add(t);
            }
        }
        return newOffer;
    }

    public Agency getOffersByNumNight(Agency offers, int minNum, int maxNum) {
        Agency result = new Agency();
        result.setType(offers.getType());

        for (Offer offer : offers.getOffers()) {
            if (offer.getNumNights() > minNum && offer.getNumNights() < maxNum) {
                result.add(offer);
            }
        }
        return result;
    }

    public Agency getOffersByPrice(Agency offers, int minCost, int maxCost) {
        Agency result = new Agency();
        result.setType(offers.getType());

        for (Offer offer : offers.getOffers()) {
            if (offer.getPrice() >= minCost && offer.getPrice() <= maxCost) {
                result.add(offer);
            }
        }
        return result;
    }

}
