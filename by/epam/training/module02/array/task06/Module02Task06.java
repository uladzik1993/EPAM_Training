package by.epam.training.module02.array.task06;

// Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

public class Module02Task06 {

    public static void main(String[] args) {

        int N = 20;
        int[] mass = new int[20];
        int sum = 0;

        System.out.println("Сгенерированн массив: ");

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * N);
            System.out.print(mass[i] + " ");
        }

        System.out.println(" ");

        for (int i = 2; i < mass.length; i++) {
            for (int y = 2; y < i; y++) {
                if (i % y != 0)
                    sum += mass[i];
                break;
            }
        }

        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами равна: ");
        System.out.println(sum);

    }
}


