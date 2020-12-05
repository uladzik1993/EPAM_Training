package by.epam.training.module01.branch.task03;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Module01Task03 {

    public static void main(String[] args) {

        int x1 = Engine.enterInt("Введите первую координату точки А");
        int y1 = Engine.enterInt("Введите вторую координату точки А");
        int x2 = Engine.enterInt("Введите первую координату точки B");
        int y2 = Engine.enterInt("Введите вторую координату точки B");
        int x3 = Engine.enterInt("Введите первую координату точки C");
        int y3 = Engine.enterInt("Введите вторую координату точки C");

        if (Engine.result(x1, x2, x3, y1, y2, y3)) {
            System.out.println("На одной линии");
        } else System.out.println("Не на одной линии");
    }
}
