package by.epam.training.module03.regular.task02;


import by.epam.training.module03.regular.task02.enity.Tag;
import by.epam.training.module03.regular.task02.logic.MainAction;
import by.epam.training.module03.regular.task02.view.ViewAction;

import java.util.List;

public class App {

    public static void main(String[] args) {

        String textXML1 = "<notes>\n" + "<note id=\"1\">\n" + "<to>Вася</to>\n" + "<from>Света</from>\n"
                + "<heading>Напоминание</heading>\n" + "<body>Позвони мне завтра!</body>\n" + "</note>\n"
                + "<note id=\"2\" point=\"45y1\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n"
                + "<heading>Важное напоминание</heading>\n" + "<body/>\n" + "</note>\n" + "</notes>\n";

        MainAction action = new MainAction();
        ViewAction view = new ViewAction();

        List<Tag> tagsList;

        tagsList = action.splitXMLbyTag(textXML1);

        view.printTagList(tagsList);
    }

}
