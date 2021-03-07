package by.epam.training.module04.garage;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Runner {
    public static void main(String[] args) {
        Engine test = new Engine(1, 200);
        Wheel testWheel = new Wheel("Nokia",17, Wheel.Type.Summer);

        System.out.println(test.toString());
        System.out.println(testWheel.toString());
    }
}
