package by.epam.training.module04.task08;

public class Customer {
   private int id;
   private String name;
   private String surname;
   private String patronymic;
   private String address;
   private String cardNumber;
   private int accountNumber;

   public Customer (int id, String name, String surname, String patronymic,
                    String address, String cardNumber, int accountNumber) {
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

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardNumber() {
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
                "; \n ФИО = " + surname + " " +  name + " " +patronymic +
                "; \n Адрес = " + address +
                "; \n Номер кредитной карты = " + cardNumber +
                "; \n Номер банковского счета = " + accountNumber + ";";
    }
}