package by.epam.training.module01.branch.task05;

//Вычислить значение функции F(x)

public class Module01Task05 {

    public static void main(String[] args) {

        double F;

        int x = (int) (Math.random() * 10);

        if (x <= 3) {
            F = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("При x <= 3");
            System.out.println("F(x) = " + F);
        } else if (x > 3) {
            F = 1 / (Math.pow(x, 3) + 6);
            System.out.println("При x > 3");
            System.out.println("F(x) = " + F);
        }
    }
}
