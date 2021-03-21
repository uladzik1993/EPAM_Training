package by.epam.training.module04.task08;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int accountNumber;

    public Customer(int id, String name, String surname, String patronymic,
                    String address, int cardNumber, int accountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return
                "  \n id = " + id +
                        "; \n ФИО = " + surname + " " + name + " " + patronymic +
                        "; \n Адрес = " + address +
                        "; \n Номер кредитной карты = " + cardNumber +
                        "; \n Номер банковского счета = " + accountNumber + ";";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + accountNumber;
        result = prime * result + cardNumber;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
            Customer  other = (Customer) obj;
            if (address == null) {
                if (other.address != null)
                    return false;
        }
            else if (!address.equals(other.address))
                return false;
            if (accountNumber != other.accountNumber)
                return false;
            if (cardNumber != other.cardNumber)
                return false;
            if (id != other.id)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            }
                else if (!name.equals(other.name))
                    return false;
                if (patronymic == null) {
                    if (other.patronymic != null)
                        return false;
                }
                    else if (!patronymic.equals(other.patronymic))
                        return false;
                    if (surname == null){
                        if (other.surname != null)
                            return false;
                    }
                    else if (!surname.equals(other.surname))
                        return false;
            return true;
    }
}