package by.epam.training.module02.array.task04;

// Даны действительные числа а1 ,а2 ,..., а(n) .
// Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Module02Task04 {

    public static void main(String[] args) {

        int[] number = new int[]{8, 2, 12, 90, 22, 5, 17, 55, 11};
        int numbMax = 0;
        int numbMin = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > number[numbMax]) {
                numbMax = i;
            } else if (number[i] < number[numbMin]) {
                numbMin = i;
            }
        }

        int tmp = number[numbMax];
        number[numbMax] = number[numbMin];
        number[numbMin] = tmp;

        System.out.println(Arrays.toString(number));
    }
}
