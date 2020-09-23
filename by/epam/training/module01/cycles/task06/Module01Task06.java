package by.epam.training.module01.cycles.task06;

//Вывести на экран соответствий между символами
// и их численными обозначениями в памяти компьютера.

public class Module01Task06 {

    public static void main(String[] args) {

        System.out.println("Symbol ---- ASCII");

        for (int i = 1; i <= 255; i++) {
            char ch = (char) i;

            System.out.println(ch + "  ---   " + i);
        }
    }
}
