package by.epam.training.module02.sorting.task08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<>(Arrays.asList(new Fraction(5, 6), new Fraction(7, 10),
                new Fraction(7, 4), new Fraction(2, 3), new Fraction(1, 2), new Fraction(7, 8),
                new Fraction(9, 10), new Fraction(1, 2), new Fraction(5, 12), new Fraction(3, 8)));


        long one = 1;
        for (Fraction fraction : fractions) {
            long down = fraction.getDown();
            one = one * fraction.getDown() / countCommonDenominator(one, down);
        }
        long leastCommonDenominator = one;

        List<Fraction> processedFractions = new ArrayList<>();
        for (Fraction fraction : fractions) {
            Fraction processedFraction = fraction.setLeastCommonDenominator(leastCommonDenominator);
            processedFractions.add(processedFraction);
        }
        processedFractions.sort(Fraction::sort);

        for (Fraction fraction : processedFractions) {
            System.out.println(fraction);
        }

    }

    static long countCommonDenominator(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
