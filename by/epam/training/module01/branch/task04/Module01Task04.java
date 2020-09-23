package by.epam.training.module01.branch.task04;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Module01Task04 {

    public static void main(String[] args) {

        int a = checkBrick.enterSize("Какая ширина отверстия?");
        int b = checkBrick.enterSize("Какая высота отверстия?");

        System.out.println("Ну и шо ты хочешь туда засунуть?");

        int x = checkBrick.enterSize("Ширина?");
        int y = checkBrick.enterSize("А высота?");
        int z = checkBrick.enterSize("А в длину сколько?");

        checkBrick.result(a, b, x, y, z);

    }
}
