package by.epam.training.module04.task09;

import java.util.ArrayList;

public class Logic {
    public static ArrayList<Book> returnBooksBy(String author, ArrayList<Book> books1) {

        ArrayList<Book> books2 = new ArrayList<>();

        for (Book one_book : books1) {
            if (one_book.getAuthor().equals(author)) {
                books2.add(one_book);
            }
        }
        return books2;
    }

    public static ArrayList<Book> returnBooksPublishedBy(String publisher,
                                                         ArrayList<Book> books1) {
        ArrayList<Book> books2 = new ArrayList<>();
        int counter = 0;

        for (Book one_book : books1) {
            if (!one_book.getPublisher().equals(publisher)) {
                counter++;
            }
            if (one_book.getPublisher().equals(publisher)) {
                books2.add(one_book);
            }
            if (counter == 5) {
                System.out.println("Книги такого издательства нет.");
            }
        }
        return books2;
    }

    public static ArrayList<Book> returnBooksPubAfter(int yearPublished,
                                                      ArrayList<Book> books1) {
        ArrayList<Book> books2 = new ArrayList<>();

        for (Book one_book : books1) {
            if (one_book.getYear() >= yearPublished || one_book.getYear() < 1500 ||
                    one_book.getYear() > 2021) {
                books2.add(one_book);
            }
        }
        return books2;
    }
}

