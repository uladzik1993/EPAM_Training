package by.epam.training.module01.branch.task02;

//Найти max{min(a, b), min(c, d)}.

public class Module01Task02 {

    public static void main(String[] args) {

        int a = Max.enterInt("A");
        int b = Max.enterInt("B");
        int c = Max.enterInt("C");
        int d = Max.enterInt("D");

        Max.result(a, b, c, d);

    }
}
