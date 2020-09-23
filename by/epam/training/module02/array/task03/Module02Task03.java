package by.epam.training.module02.array.task03;

// Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Module02Task03 {
    public static void main(String[] args) {
        int[] box = new int[]{45, 50, 32, -1, 33, 0, -23, -90, 20, -13, 0, 39, 1};

        int minus = 0;
        int plus = 0;
        int zero = 0;

        for (int i = 0; i < box.length; i++) {
            if (box[i] > 0) {
                plus++;
            } else if (box[i] < 0) {
                minus++;
            } else {
                zero++;
            }
        }

        System.out.println("Отрицательных: " + minus);
        System.out.println("Положительных: " + plus);
        System.out.println("Нулей: " + zero);
    }


}
