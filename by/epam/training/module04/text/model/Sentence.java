package by.epam.training.module04.text.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Sentence {

    private List<Word> words = new ArrayList<>();

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public void addWord(Word word) {
        words.add(word);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        for (Word word : words) {
            String w = String.valueOf(word);
            joiner.add(w);
        }
        return joiner.toString();
    }
}
