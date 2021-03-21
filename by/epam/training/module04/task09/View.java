package by.epam.training.module04.task09;

import java.util.ArrayList;

public class View {

    public static void printBookBy(String author, ArrayList<Book> books) {
        ArrayList<Book> booksList = new ArrayList<>();
        booksList = Logic.returnBooksBy(author, books);

        if (booksList.size() == 0) {
            System.out.println("Такаго автора нет в базе.");
        } else if (booksList.size() > 0) {
            System.out.println("Список книг заданного автора: ");
            for (Book b : booksList) {
                System.out.println("Название книги: " + b.getName() + " Автор: " +
                        b.getAuthor());
            }
        }
    }

    public static void printBookPubBy(String publisher, ArrayList<Book> books) {
        ArrayList<Book> booksList = new ArrayList<>();
        booksList = Logic.returnBooksPublishedBy(publisher, books);

        if (booksList.size() == 0) {
            System.out.println("Книги такого издательства нет в базе.");
        } else if (booksList.size() > 0) {
            System.out.println("Книги данного издательства: ");
            for (Book b : booksList) {
                System.out.println("Название книги: " + b.getName() + " Автор: " +
                        b.getAuthor());
            }
        }
    }

    public static void printBookPubAfter(int year, ArrayList<Book> books) {
        ArrayList<Book> booksList = new ArrayList<>();
        booksList = Logic.returnBooksPubAfter(year, books);

        if (booksList.size() == 0) {
            System.out.println("Книги такого года нет в базе");
        } else if (booksList.size() > 0) {
            System.out.println("Книги, выпущенные после данного года: ");
            for (Book b : booksList) {
                System.out.println("Название книги: " + b.getName() + " Автор(ы): " + b.getAuthor());
            }
        }
    }
}
