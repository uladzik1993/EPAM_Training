package by.epam.training.module04.task01;

public class Test1 {
    int lenght;
    int width;

    void printThis() {
        System.out.println(lenght);
        System.out.println(width);
    }

    Test1 (int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }
    void edit (int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    void sumNum() {
        System.out.println("Сумма чисел равна: " + (lenght + width));
    }

    void maxNum() {
        if (lenght > width) {
            System.out.println("Наибольшее число: " + lenght);
        } else if (lenght == width) {
            System.out.println("Ошибка. Числа равны.");
        } else System.out.println("Наибольшее число: " + width);
    }
}

