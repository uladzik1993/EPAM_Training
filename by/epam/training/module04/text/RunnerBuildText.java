package by.epam.training.module04.text;

public class RunnerBuildText {
    public static void main(String[] args) {
        Text note = new Text("Сказка");

        note.sentence("Здесь должна быть ваша реклама");
        note.addText("Решил добавить сюда еще немного текста");
        note.addWord("слово");

        note.viewTopic();
        note.viewText();

    }
}
