package by.epam.training.module04.task01;

// Создайте класс Test1 c двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

public class Module04Task01 {
    public static void main(String[] args) {
        Test1 one = new Test1(20, 30);
        System.out.println("Данные до изменения: ");
        one.printThis();
        one.edit(43, 43);

        System.out.println("\nДанные после изменения: ");
        one.printThis();

        System.out.println("\nСумма введеных чисел :");
        one.sumNum();

        System.out.println("\nНаибольшее число: ");
        one.maxNum();
    }
}
