package by.epam.training.module02.array.task02;

// Дана последовательность действительных чисел а1 ,а2 ,..., а(n).
// Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.

public class Module01Task02 {

    public static void main(String[] args) {

        int[] a = new int[]{12, 15, 13, 10, 20, 23, 18, 43, 27};
        int Z = 15;
        int change = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > Z) {

                System.out.println(a[i] + " больше " + Z + " по этому приравнивается к " + Z);

                a[i] = Z;
                change++;
            }
        }

        System.out.println("Итого колличество замен: " + change);
    }
}
