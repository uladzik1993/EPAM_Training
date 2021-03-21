// Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Book,
// с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
// Book: id, название, автор(ы), издательство, год издания,
// количество страниц, цена, тип переплета.
//
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

package by.epam.training.module04.task09;

import java.security.PublicKey;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int numPage;
    private int cost;
    private String typeCover;

    public Book () {
        super();
    }

    public Book(int id, String name, String author, String publisher,
                 int year, int numPage, int cost, String typeCover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numPage = numPage;
        this.cost = cost;
        this.typeCover = typeCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTypeCover() {
        return typeCover;
    }

    public void setTypeCover(String typeCover) {
        this.typeCover = typeCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", numPage=" + numPage +
                ", cost=" + cost +
                ", typeCover='" + typeCover + '\'' +
                '}';
    }
}
