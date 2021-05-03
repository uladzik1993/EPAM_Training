package by.epam.training.module05.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {

    private String name = "new_directory";
    private List<Directory> directories;
    private List<File> fileList;

    // так не делают обычно и в прод коде я такого не вижу, инициализируй в полях просто. это то же самое все равно
    // я просто оставила тебе, чтоб пояснить, но ты удали этот код
//    {
//        name = "new_directory";
//    }

    public Directory() {
    }

    public Directory(String name) {
        this.name = name;
    }

    public void addDirectory(Directory directory) {
        if (directories == null) {
            directories = new ArrayList<>();
        }
        directories.add(directory);
    }

    public void addFile(File file) {
        if (fileList == null) {
            fileList = new ArrayList<>();
        }
        fileList.add(file);
    }

    public void removeDirectory(String title) {
        for (Directory directory : directories) {
           // if (directory.getName() == title) { // Отсылаю к https://javarush.ru/groups/posts/equals-java-sravnenie-strok
            if (directory.getName().equals(title)) {
                directories.remove(directory);
                break;
            }
        }
    }

    public void removeFile(String title) {
        for (File file : fileList) {
            if (file.getName().equals(title)) {
                fileList.remove(file);
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rename(String newName) {
        setName(newName);
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name) && Objects.equals(directories, directory.directories)
                && Objects.equals(fileList, directory.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, directories, fileList);
    }

    @Override
    public String toString() {
        return "Directory [title=" + name + ", directoryList=" + directories + ", fileList=" + fileList + "]";
    }

}
