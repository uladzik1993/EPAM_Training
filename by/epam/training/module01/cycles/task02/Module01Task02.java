package by.epam.training.module01.cycles.task02;

//Вычислить значения функции на отрезке [а,b] c шагом h:

public class Module01Task02 {

    public static void main(String[] args) {

        int a = -7;
        int b = 7;
        int y;
        int h = 2;

        for (int x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.println("При x > 2 значение функции y = " + y);
            } else if (x <= 2) {
                y = -x;
                System.out.println("При x <= 2 значение функции y = " + y);
            }
        }
    }
}


