package by.epam.training.module04.task06;

// Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
// с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Runner {
    public static void main(String[] args) {
        Clock rolex = new Clock(23,30,22);
        rolex.setHour(15);
        rolex.setMin(23);
        rolex.setSec(30);

        rolex.addHour(21);
        rolex.addMin(30);
        rolex.addSec(40);

        System.out.println("\n" + rolex.toString());
    }
}
