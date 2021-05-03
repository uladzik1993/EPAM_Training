package by.epam.training.module04.tourist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agency {
    private List<Offer> offers = new ArrayList<>();
    private Type.offerType type = Type.offerType.BASIC;

    public Agency() {
    }

    public Agency(Type.offerType type) {
        this.type = type;
    }

    public Agency(Offer agency) {
        offers.add(agency);
    }

    public void add(Offer agency) {
        offers.add(agency);
    }

    public void remove(Offer agency) {
        offers.remove(agency);
    }

    public void remove(int id) {
        for (Offer a : this.offers) {
            if (id == a.getId()) {
                offers.remove(a);
                break;
            }
        }
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public List<Offer> getOffers() {
        return this.offers;
    }

    public Type.offerType getType() {
        return type;
    }

    public void setType(Type.offerType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agency that = (Agency) o;
        return Objects.equals(offers, that.offers) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(offers, type);
    }

    @Override
    public String toString() {
        return "Agency{" +
                "offers=" + offers +
                ", type=" + type +
                '}';
    }
}
