package by.epam.training.module04.tourist;

import java.util.Comparator;

public class Agency {


    private int id;
    private Type.tourType type;
    private Type.transportation transport;
    private Type.food food;
    private Type.destination destinition;
    private int numNights;
    private int price;

    public Agency(int id, Type.tourType type, Type.transportation transport, Type.food food,
                Type.destination destinition, int numNights, int price) {
        this.id = id;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.destinition = destinition;
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

    public Type.destination getDestinition() {
        return destinition;
    }

    public void setDestinition(Type.destination destinition) {
        this.destinition = destinition;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destinition == null) ? 0 : destinition.hashCode());
        result = prime * result + ((food == null) ? 0 : food.hashCode());
        result = prime * result + id;
        result = prime * result + numNights;
        result = prime * result + price;
        result = prime * result + ((transport == null) ? 0 : transport.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Agency other = (Agency) obj;
        if (destinition != other.destinition)
            return false;
        if (food != other.food)
            return false;
        if (id != other.id)
            return false;
        if (numNights != other.numNights)
            return false;
        if (price != other.price)
            return false;
        if (transport != other.transport)
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tour [id=" + id + ", type=" + type + ", transport=" + transport + ", food=" + food + ", destinition="
                + destinition + ", numNights=" + numNights + ", price=" + price + "]";
    }

    public static Comparator<Agency> ById = new Comparator<Agency>() {

        @Override
        public int compare(Agency o1, Agency o2) {
            return o1.getId() - o2.getId();
        }
    };

    public static Comparator<Agency> ByNumNights = new Comparator<Agency>() {

        @Override
        public int compare(Agency o1, Agency o2) {
            return o1.getNumNights() - o2.getNumNights();
        }
    };

    public static Comparator<Agency> ByPrice = new Comparator<Agency>() {

        @Override
        public int compare(Agency o1, Agency o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };


}
