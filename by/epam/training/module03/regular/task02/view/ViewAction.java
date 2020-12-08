package by.epam.training.module03.regular.task02.view;

import by.epam.training.module03.regular.task02.enity.Tag;

import java.util.List;

public class ViewAction {

    public void printTagList(List<Tag> tagsList) {
        for (Tag element : tagsList) {
            System.out.println(element);
        }
    }
}
