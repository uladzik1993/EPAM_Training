package by.epam.training.module03.regular.task01;


import by.epam.training.module03.regular.task01.logic.Action;
import by.epam.training.module03.regular.task01.view.ViewAction;

public class App {

    private static String text = "Что такое – лексема?\n"
            + "Понятие \"лексема\" американскими учёными смешивается с понятием \"идиома\". "
            + "Французские лингвисты также по-своему трактуют этот термин. "
            + "Оно рассматривается ими как явление, сходное по значению с термином «основа слова». "
            + "В русской лингвистике лексема – это слово как абстрактное явление, единица словарного состава языка. "
            + "Этот термин обычно встречается в заглавиях статей в орфографических и некоторых других словарях. \n"
            + "Лексема – это абстрактная единица во всём множестве ее форм и смысловых значений. "
            + "Таким образом, лексема рассматривается как явление комплексное, объединяющее в себе грамматическую и семантическую сторону.\n";

    public static void main(String[] args) {
        ViewAction view = new ViewAction();
        Action action = new Action();

        int selectedAction;


        selectedAction = view.enterIntFromConsole("Выберите необходимое действие: \n "
                + "1 - разбить текст на абзацы \n "
                + "2 - разбить текст на предложения \n "
                + "3 - разбить текст на слова \n", 1, 3);

        switch (selectedAction) {
            case 1: {
                action.splitTextOnParagraphs(text);
                break;
            }

            case 2: {
                action.splitTextOnSentences(text);
                break;
            }

            case 3: {
                action.splitTextOnWords(text);
                break;
            }
        }
    }

}

