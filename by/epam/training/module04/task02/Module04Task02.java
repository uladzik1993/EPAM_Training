package by.epam.training.module04.task02;

// Создйте класс Test2 c двумя переменными.
// Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Module04Task02 {
    public static void main(String[] args) {
        Test2 hero = new Test2(21, 34);
        System.out.println(hero.getTwo());
    }
}
