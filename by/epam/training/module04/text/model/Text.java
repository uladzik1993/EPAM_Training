package by.epam.training.module04.text.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Text {

    private List<Sentence> sentences = new ArrayList<>();

    private String title;

    public Text(String title) {
        this.title = title;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");

        for (Sentence sentence : sentences) {
            String s = String.valueOf(sentence);
            joiner.add(s);
        }
        return title + "\n" + joiner.toString();
    }
}
