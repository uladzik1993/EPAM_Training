package by.epam.training.module01.branch.task01;

//Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник,
// и если да, то будет ли он прямоугольным.

public class Runner {

    public static void main(String[] args) {

        int a = Triangle.enter("а");
        int b = Triangle.enter("b");

        Triangle.check(a, b);
    }
}
