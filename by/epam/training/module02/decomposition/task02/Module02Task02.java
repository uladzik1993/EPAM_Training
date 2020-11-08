package by.epam.training.module02.decomposition.task02;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Module02Task02 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 8;
        int d = 10;
        int gcdABCD;

        gcdABCD = gcd(gcd(gcd(a, b), c), d);

        System.out.printf("НОД(%d,%d,%d,%d)=%d", a, b, c, d, gcdABCD);
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