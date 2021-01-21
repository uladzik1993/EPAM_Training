package by.epam.training.module04.text;

import by.epam.training.module02.multiarray.task12.Sort;

import java.util.ArrayList;

public class Text {

    private ArrayList txt = new ArrayList();
    private String topic;

    public Text(String topic) {
        this.topic = topic;
    }

    public void sentence(String someText) {
        txt.add(someText);
    }

    public void addWord(String suppWord) {
        txt.add(suppWord);
    }

    public void addText(String suppText) {
        txt.add(suppText);
    }

    public void viewText() {
        System.out.println(txt);
    }

    public void viewTopic() {
        System.out.println("Заголовок: " + topic);
    }


}
