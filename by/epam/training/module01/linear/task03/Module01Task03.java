package by.epam.training.module01.linear.task03;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Module01Task03 {

    public static void main(String[] args) {

        double x = 3;
        double y = 2;

        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y))) * Math.tan(x * y);

        System.out.println(z);

    }

}
