package by.epam.training.module04.task10;

import java.util.ArrayList;

public class AirlineBase {

    private ArrayList<Airline> list = new ArrayList<Airline>();

    public AirlineBase(ArrayList<Airline> list) {
        this.list = list;
    }

    public AirlineBase(Airline airline) {
        this.list.add(airline);
    }

    public AirlineBase() {

    }

    void add(Airline airline) {
        list.add(airline);
    }

    void remove(int index) {
        list.remove(index);
    }

    public ArrayList<Airline> getList() {
        return list;
    }

    public void setList(ArrayList<Airline> list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((list == null) ? 0 : list.hashCode());
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
        AirlineBase other = (AirlineBase) obj;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Schedule [list=" + list + "]";
    }
}
