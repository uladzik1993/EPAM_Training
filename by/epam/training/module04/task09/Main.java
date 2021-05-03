package by.epam.training.module04.task09;

import java.util.List;

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
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        List<Book> baseLibrary = library.getBaseLibrary();

        String author = InputService.readInput("Введите имя автора: ");
        List<Book> booksByAuthor = LibraryService.getBooksByAuthor(author, baseLibrary);
        // твое ВЬЮ не должно ничего знать о логике. оно просто берет лист и печатает его
        // не нужно в него прятать логику. логика тут должна быть в мейне - отдавать лист, который вью потом печатает
        View.printBooksByAuthor(booksByAuthor);

        String publisher = InputService.readInput("Введите издательство: ");
        List<Book> booksByPublisher = LibraryService.getBooksByPublisher(publisher, baseLibrary);
        View.printBooksByPublisher(booksByPublisher);

        int yearPublished = InputService.readYear("Отобразить книги выпущенные после: ");
        List<Book> booksReleasedAfterYear = LibraryService.getBooksReleasedAfter(yearPublished, baseLibrary);
        View.printBooksReleasedAfter(booksReleasedAfterYear);
    }
}
