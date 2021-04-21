package by.epam.training.module05.task01;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<Directory> directoryList;
    private List<File> fileList;

    {
        name = "mew_directory";
    }

    public Directory() {
    }

    public Directory(String name) {
        this.name = name;
    }

    public void addDirectory(Directory directory) {
        if (directoryList == null) {
            directoryList = new ArrayList<Directory>();
        }
        directoryList.add(directory);
    }

    public void addFile(File file) {
        if (fileList == null) {
            fileList = new ArrayList<File>();
        }
        fileList.add(file);
    }

    public void removeDirectory(String title) {
        for (Directory directory : directoryList) {
            if (directory.getName() == title) {
                directoryList.remove(directory);
                break;
            }
        }
    }

    public void removeFile(String title) {
        for (File file : fileList) {
            if (file.getName() == title) {
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

    public List<Directory> getDirectoryList() {
        return directoryList;
    }

    public void setDirectoryList(List<Directory> directoryList) {
        this.directoryList = directoryList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Override

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((directoryList == null) ? 0 : directoryList.hashCode());
        result = prime * result + ((fileList == null) ? 0 : fileList.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Directory other = (Directory) obj;
        if (directoryList == null) {
            if (other.directoryList != null)
                return false;
        } else if (!directoryList.equals(other.directoryList))
            return false;
        if (fileList == null) {
            if (other.fileList != null)
                return false;
        } else if (!fileList.equals(other.fileList))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Directory [title=" + name + ", directoryList=" + directoryList + ", fileList=" + fileList + "]";
    }

}
