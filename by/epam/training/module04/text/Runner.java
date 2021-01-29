package by.epam.training.module04.text;

// Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

import by.epam.training.module04.text.model.Text;
import by.epam.training.module04.text.service.TextService;

public class Runner {

    public static void main(String[] args) {
        Text text = new Text("Сказка");

        TextService textService = new TextService();

        textService.updateText(text, "Здесь должна быть ваша реклама.");
        textService.updateText(text, "Решил добавить сюда еще немного текста.");
        textService.updateText(text, "Привет?");

        textService.printText(text);
        textService.printTextTitle(text);

    }
}
