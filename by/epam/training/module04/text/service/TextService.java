package by.epam.training.module04.text.service;

import by.epam.training.module04.text.model.Sentence;
import by.epam.training.module04.text.model.Text;
import by.epam.training.module04.text.model.Word;
import java.util.ArrayList;
import java.util.List;

public class TextService {

    public void updateText(Text text, String update) {
        String[] parsedUpdate = update.split("[\\s]");
        List<Word> words = new ArrayList<>();

        for (String word : parsedUpdate) {
            words.add(new Word(word));
        }
        Sentence sentence = new Sentence();
        sentence.setWords(words);
        text.addSentence(sentence);
    }

    public void printTextTitle(Text text) {
        System.out.println(text.getTitle());
    }

    public void printText(Text text) {
        System.out.println(text);
    }

}
