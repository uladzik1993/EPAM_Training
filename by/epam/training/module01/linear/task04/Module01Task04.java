package by.epam.training.module01.linear.task04;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Module01Task04 {

    public static void main(String[] args) {

        double r = 983.231;

        double integer = (r * 1000) % 1000;
        double fraction = (int) r / 1000.0;
        double result = integer + fraction;

        System.out.println(result);

    }
}
