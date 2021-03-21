package by.epam.training.module04.task09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        ArrayList<Book> lib = library.getBaseLibrary();

        String author = DataInput.checkInput("Введите имя автора: ");
        View.printBookBy(author, lib);

        String publisher = DataInput.checkInput("Введите издательство: ");
        View.printBookPubBy(publisher, lib);

        int yearPub = DataInput.checkYearPub("Отобразить книги выпущенные после: ");
        View.printBookPubAfter(yearPub,lib);
    }


}
