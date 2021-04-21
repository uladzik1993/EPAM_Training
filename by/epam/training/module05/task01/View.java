package by.epam.training.module05.task01;

public class View {

    public static void printDirectory(Directory directory) {

        System.out.println("Название директории: " + directory.getName());
        System.out.println("Список директорий: ");

        for (Directory innerDirectory : directory.getDirectoryList()) {
            System.out.print(innerDirectory.getName() + ", ");
        }

        System.out.print("\n Список файлов: ");

        for (File innerFile : directory.getFileList()) {
            System.out.print(innerFile.getName() + ", ");
        }

    }

}
