package by.epam.training.module02.decomposition.task11;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Module02Task11 {
    public static void main(String[] args) {
        int numOne = 12435;
        int numTwo = 6745;

        boolean isFirstNumberBigger = String.valueOf(numOne).toCharArray().length > String
                .valueOf(numTwo).toCharArray().length;
        System.out.println(isFirstNumberBigger ? "В первом числе больше цифр."
                : "В втором числе больше цифр.");
    }
}
