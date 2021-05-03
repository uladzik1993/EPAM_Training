package by.epam.training.module04.tourist;

import java.util.Comparator;
import java.util.Objects;

public class Offer {
    private int id;
    private Type.tourType type;
    private Type.transportation transport;
    private Type.food food;
    private Type.destination destination;
    private int numNights;
    private int price;

    public Offer(int id, Type.tourType type, Type.transportation transport, Type.food food,
                 Type.destination destination, int numNights, int price) {
        this.id = id;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.destination = destination;
        this.numNights = numNights;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public Type.tourType getType() {
        return type;
    }

    public void setType(Type.tourType type) {
        this.type = type;
    }

    public Type.transportation getTransport() {
        return transport;
    }

    public void setTransport(Type.transportation transport) {
        this.transport = transport;
    }

    public Type.food getFood() {
        return food;
    }

    public void setFood(Type.food food) {
        this.food = food;
    }

    public Type.destination getDestination() {
        return destination;
    }

    public void setDestination(Type.destination destination) {
        this.destination = destination;
    }

    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Comparator<Offer> ById = Comparator.comparingInt(Offer::getId);

    public static Comparator<Offer> ByNumNights = Comparator.comparingInt(Offer::getNumNights);

    public static Comparator<Offer> ByPrice = Comparator.comparingInt(Offer::getPrice);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return id == offer.id && numNights == offer.numNights && price == offer.price && type == offer.type && transport == offer.transport && food == offer.food && destination == offer.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, transport, food, destination, numNights, price);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", type=" + type +
                ", transport=" + transport +
                ", food=" + food +
                ", destination=" + destination +
                ", numNights=" + numNights +
                ", price=" + price +
                '}';
    }
}
