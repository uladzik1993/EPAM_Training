package by.epam.training.module01.cycles.task07;

//Для каждого натурального числа в промежутке от m до n
// вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

public class Module01Task07 {

    public static void main(String[] args) {

        int m = Enter.enterInt("Введите  m >>");
        int n = Enter.enterInt("Введите  n >>");
        int a = 0;

        for (int i = m; m < n; m++) {
            System.out.println("Для цифры " + m + " делители: ");
            for (int x = 2; x < m; x++) {
                if (m % x == 0) {
                    System.out.println(x);
                }

            }
        }
    }
}
