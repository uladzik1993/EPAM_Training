package by.epam.training.module02.decomposition.task09;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Module02Task09 {
    public static void main(String[] args) {
        int x = 6;
        int y = 9;
        int z = 5;
        int t = 7;

        areaСalculation(x, y, z, t);

    }

    public static void areaСalculation(int x, int y, int z, int t) {
        double d = Math.sqrt(x * x + y * y);
        double s1 = x * y * 0.5;
        double s2 = 0.25 * Math.sqrt((d + z + t) * (d + z - t) * (d + t - z) * (z + t - d));
        double s = s1 + s2;
        System.out.println(s);
    }
}
