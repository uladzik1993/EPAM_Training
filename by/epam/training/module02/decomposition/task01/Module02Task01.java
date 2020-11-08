package by.epam.training.module02.decomposition.task01;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
// натуральных чисел

public class Module02Task01 {

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println("НОК(" + a + "," + b + ")=" + lcm(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}