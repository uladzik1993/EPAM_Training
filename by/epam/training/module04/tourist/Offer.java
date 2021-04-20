package by.epam.training.module04.tourist;

import java.util.ArrayList;
import java.util.List;

public class Offer {
    private List<Agency> list;
    private Type.offerType type;

    {
        this.list = new ArrayList<Agency>();
        type = Type.offerType.BASIC;
    }

    public Offer() {}

    public Offer(Type.offerType type) {
        this.type = type;
    }

    public Offer(Agency agency) {
        list.add(agency);
    }

    public void add(Agency agency) {
        list.add(agency);
    }

    public void remove (Agency agency){
        list.remove(agency);
    }

    public void remove (int id) {
        for (Agency a : this.list) {
            if (id == a.getId()) {
                list.remove(a);
                break;
            }
        }
    }

    public void setList(List<Agency> list) {
        this.list = list;
    }

    public List<Agency> getList() {
        return this.list;
    }

    public Type.offerType getType () {
        return type;
    }

    public void setType (Type.offerType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((list == null) ? 0 : list.hashCode());
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
        Offer other = (Offer) obj;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        if (type != other.type)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Offer [list=" + list + ", type=" + type + "]";
    }

}
