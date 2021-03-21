package by.epam.training.module04.task09;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> baseLibrary = new ArrayList<Book>();

    public Library() {
        super();
        ArrayList<Book> defaultBaseLibrary = new ArrayList<Book>();
        defaultBaseLibrary.add(new Book(1, "The Java Language Specification",
                "James Gosling", "Oracle",
                2015, 768, 0, "eBook"));
        defaultBaseLibrary.add(new Book(2,"Thinking in Java", "Bruce Eckel",
                "Prentice Hall", 2006, 790, 100, "hardCover"));
        defaultBaseLibrary.add(new Book(3, "Head First Java",
                "Kathy Sierra & Bert Bates", "O'Reilly",
                2004, 664, 60, "softCover"));
        defaultBaseLibrary.add(new Book(4, "The Java Programming Language",
                "James Gosling", "Prentice Hall",
                2012, 324, 4, "eBook"));
        defaultBaseLibrary.add(new Book(5, "A Beginner's Guide", "Herbert Schildt",
                "McGraw-Hill Education", 2019, 567,
                120, "hardCover"));

        this.baseLibrary = defaultBaseLibrary;
    }

    public Library(ArrayList<Book> baseLibrary) {
        super();
        this.baseLibrary = baseLibrary;
    }

    public ArrayList<Book> getBaseLibrary() {
        return baseLibrary;
    }
}
