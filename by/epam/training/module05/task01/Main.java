package by.epam.training.module05.task01;

// Создать объект класса Текстовый файл, используя классы Файл, Директория.
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

public class Main {

    public static void main(String[] args) {

        Directory directory = new Directory("Мои файлы");

        directory.addDirectory(new Directory("learning"));
        directory.addDirectory(new Directory("work"));

        directory.addFile(new TextFile("presentation"));
        directory.addFile(new TextFile("report"));
        directory.addFile(new TextFile("finance"));

        View.printDirectory(directory);

    }
}
