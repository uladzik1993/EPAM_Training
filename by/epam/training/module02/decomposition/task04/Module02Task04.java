package by.epam.training.module02.decomposition.task04;

// На плоскости заданы своими координатами n точек.
// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.

public class Module02Task04 {

    public static void main(String[] args) {
        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 50);
            y[i] = (int) (Math.random() * 50);
        }

        System.out.println("Заданы точки с координатами:");
        for (int i = 0; i < y.length; i++) {
            System.out.printf("(%3d, %3d)\n", x[i], y[i]);
        }

        int[] index = distanceMax(x, y);
        System.out.printf("Между точками (%3d, %3d) (%3d, %3d) максимальное расстояние",
                x[index[0]], y[index[0]], x[index[1]], y[index[1]]);
    }

    public static int[] distanceMax(int[] x, int[] y) {
        int[] index = new int[2];
        double max = 0;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                double d = distance(x[i], y[i], x[j], y[j]);
                if (max < d) {
                    index[0] = i;
                    index[1] = j;
                    max = d;
                }
            }
        }
        return index;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double d;
        d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return d;
    }
}
