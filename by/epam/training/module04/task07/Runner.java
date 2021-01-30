package by.epam.training.module04.task07;

// Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.

public class Runner {
    public static void main(String[] args) {
        Triangle ball = new Triangle(5,10,13);

        System.out.println("\n Площадь данного треугольника равна: " + ball.areaСalc());
        System.out.println("\n Периметр данного треугольника равен: " +  ball.perimeterCalc());

    }

}
