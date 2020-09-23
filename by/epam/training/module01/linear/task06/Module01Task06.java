package by.epam.training.module01.linear.task06;

//Для данной области составить линейную программу,
// которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
// и false — в противном случае:

import java.util.Scanner;

public class Module01Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean result1 = true;
        boolean result2 = true;

        System.out.println("Введите x:");
        int x = sc.nextInt();

        System.out.println("Введите y:");
        int y = sc.nextInt();

        System.out.println(y + " " + x);


        if (x >= -4) {
            if (x <= 4) {
                result1 = true;
            }
        } else result1 = false;

        if (y >= -3) {
            if (y <= 4) {
                result2 = true;
            }
        } else result2 = false;
        System.out.println(result1 == result2);
    }
}
