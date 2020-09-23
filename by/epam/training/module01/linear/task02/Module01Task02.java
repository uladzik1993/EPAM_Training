package by.epam.training.module01.linear.task02;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Module01Task02 {

    public static void main(String[] args) {

        double a = 3;
        double b = 8;
        double c = 4;

        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(z);

    }
}
