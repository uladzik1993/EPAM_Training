package by.epam.training.module04.task05;

// Опишите класс, реализующий десятичный счетчик,
// который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

public class Runner {
    public static void main(String[] args) {
        Counter one = new Counter(40);
        one.countDown(35);
    }
}
