package by.epam.training.module02.decomposition.task06;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Module02Task06 {
    public static void main(String[] args) {
        int one = 7;
        int two = 4;
        int three = 1;

        if (isSimpleThree(one, two, three)) {
            System.out.printf("Числа %d, %d, %d являются взаимно простыми.", one, two, three);
        } else {
            System.out.printf("Числа %d, %d, %d не являются взаимно простыми.", one, three, two);
        }
    }

    public static boolean isSimpleThree(int a, int b, int c) {
        return gcd(gcd(a, b), c) == 1;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
