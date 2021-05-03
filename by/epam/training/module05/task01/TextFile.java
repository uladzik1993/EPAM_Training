package by.epam.training.module05.task01;

import java.util.Objects;

public class TextFile extends File {

    private String text;

    public TextFile() {
    }

    public TextFile(String name) {
        super(name);
    }

    public TextFile(String title, String text) {
        super(title);
        this.text = text;
    }

    public void addText(String str) {
        this.text += " " + str;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return "TextFile [text=" + text + "]";
    }
}
