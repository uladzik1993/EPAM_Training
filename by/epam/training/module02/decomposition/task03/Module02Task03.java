package by.epam.training.module02.decomposition.task03;

// Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника.

public class Module02Task03 {

    public static void main(String[] args) {
        int a = 3;
        System.out.printf("Площадь шестиугольника равна: " + 6 * areaTriangle(a));
    }

    public static double areaTriangle(int a) {
        return (Math.sqrt(3) / 4) * Math.pow(a, a);

    }
}
