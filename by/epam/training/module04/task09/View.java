package by.epam.training.module04.task09;

import java.util.List;

public class View {

    public static void printBooksByAuthor(List<Book> books) {
        if (books.size() == 0) {
            System.out.println("Такаго автора нет в базе.");
        } else {
            System.out.println("Список книг заданного автора: ");
            for (Book b : books) {
                System.out.println("Название книги: " + b.getName() + " Автор: " +
                        b.getAuthor());
            }
        }
    }

    public static void printBooksByPublisher(List<Book> books) {
        if (books.size() == 0) {
            System.out.println("Книги такого издательства нет в базе.");
        } else {
            System.out.println("Книги данного издательства: ");
            for (Book b : books) {
                System.out.println("Название книги: " + b.getName() + " Автор: " +
                        b.getAuthor());
            }
        }
    }

    public static void printBooksReleasedAfter(List<Book> books) {
        if (books.size() == 0) {
            System.out.println("Книги такого года нет в базе");
        } else {
            System.out.println("Книги, выпущенные после данного года: ");
            for (Book b : books) {
                System.out.println("Название книги: " + b.getName() + " Автор(ы): " + b.getAuthor());
            }
        }
    }
}
