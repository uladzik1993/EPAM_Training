package by.epam.training.module03.regular.task01.logic;

import by.epam.training.module03.regular.task01.service.ServiceAction;
import by.epam.training.module03.regular.task01.view.ViewAction;

import java.util.Arrays;

public class Action {

    private ServiceAction service = new ServiceAction();
    private ViewAction view = new ViewAction();


    public void splitTextOnParagraphs(String text) {

        String[] paragraphs;
        paragraphs = service.splitTextOnParagraphs(text);

        view.printArrayOfString(paragraphs);

        int selectedAction;
        selectedAction = view.enterIntFromConsole(
                "Отсортировать абзацы по количеству предложений? \n " + "1 - Да \n " + "2 - Нет \n ", 1, 2);

        if (selectedAction == 1) {

            service.sortParagraphsByCountSentences(paragraphs);
            view.printArrayOfString(paragraphs);

        }
    }

    public void splitTextOnSentences(String text) {
        String[] sentences;
        sentences = service.splitTextOnSentences(text);

        view.printArrayOfString(sentences);

        int selectedAction;
        selectedAction = view.enterIntFromConsole("Выберите дальнейшее действие: \n "
                + "1 - Отсортировать слова в предложениях по количеству букв \n "
                + "2 - Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа \n "
                + "3 - Выход \n", 1, 3);

        switch (selectedAction) {
            case 1: {

                for (int i = 0; i < sentences.length; i++) {
                    sentences[i] = service.sortWordInSentenceByLength(sentences[i]);
                }

                view.printArrayOfString(sentences);
                break;

            }
            case 2: {

                String ch;
                ch = view.enterCharFromConsole("Введите символ: ");

                for (int i = 0; i < sentences.length; i++) {
                    sentences[i] = service.sortLexemesInSentenceByCountSymbol(sentences[i], ch.charAt(0));
                }

                view.printArrayOfString(sentences);
                break;

            }
            case 3: {
                break;
            }
        }
    }

    public void splitTextOnWords(String text) {

        String[] words;
        words = service.splitTextOnWords(text);

        System.out.println(Arrays.toString(words));
    }

}

