package by.epam.training.module04.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineBase {

    private List<Airline> list = new ArrayList<>();

    public AirlineBase(List<Airline> list) {
        this.list = list;
    }

    public AirlineBase(Airline airline) {
        this.list.add(airline);
    }

    public AirlineBase() {}

    void add(Airline airline) {
        list.add(airline);
    }

    void remove(int index) {
        list.remove(index);
    }

    public List<Airline> getList() {
        return list;
    }

    public void setList(List<Airline> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineBase that = (AirlineBase) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Flight [list=" + list + "]";
    }
}
