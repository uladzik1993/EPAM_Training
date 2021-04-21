package by.epam.training.module05.task01;

// Создать объект класса Текстовый файл, используя классы Файл,
// Директория. Методы: создать, переименовать, вывести на консоль
// содержимое, дополнить, удалить.

public class Main {

    public static void main(String[] args) {

        Directory myFile = new Directory("Мои файлы");

        myFile.addDirectory(new Directory("learning"));
        myFile.addDirectory(new Directory("work"));

        myFile.addFile(new TextFile("presentation"));
        myFile.addFile(new TextFile("report"));
        myFile.addFile(new TextFile("finance"));

        View.printDirectory(myFile);








    }
}
