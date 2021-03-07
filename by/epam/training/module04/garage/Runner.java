package by.epam.training.module04.garage;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Runner {
    public static void main(String[] args) {
        Car peugeot = new Car("Peugeot", 5, new Engine(1, 136),
                new Wheel[]{new Wheel("Pirelli", 17, Wheel.Type.Summer)}, 0);

        peugeot.viewInfo();

        peugeot.addFuel(60);
        peugeot.move();
        peugeot.move();
    }
}
