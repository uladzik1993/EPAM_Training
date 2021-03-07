package by.epam.training.module04.task08;

// Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer,
// с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
//   a) список покупателей в алфавитном порядке;
//   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Runner {
    public static void main(String[] args) {
        // id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета
        Customer buyer1 = new Customer(1, "Pupkin", "Vasya", "Igoreevich", "Minsk", "2312 3234 4343 4343", 4342);
        System.out.println(buyer1.toString());
    }
}