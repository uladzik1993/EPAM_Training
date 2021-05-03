package by.epam.training.module04.task09;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public static List<Book> getBooksByAuthor(String author, List<Book> books) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> getBooksByPublisher(String publisher, List<Book> books) {
        List<Book> result = new ArrayList<>();
        int counter = 0;

        for (Book book : books) {
            if (!book.getPublisher().equals(publisher)) {
                counter++;
            }
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
            if (counter == 5) {
                System.out.println("Книги такого издательства нет.");
            }
        }
        return result;
    }

    public static List<Book> getBooksReleasedAfter(int yearPublished, List<Book> books) {
        List<Book> result = new ArrayList<>();

        // one_book - ОЧЕНЬ плохое имя, во первых почему просто не book, во вторых почему через _,
        // в джаве именование camelCase
        for (Book book : books) {
            if (book.getYear() >= yearPublished) {
                result.add(book);
            }
        }
        return result;
    }
}

