package by.epam.training.module04.task07;

public class Triangle {

    private int ab = 0;
    private int bc = 0;
    private int cd = 0;

    public Triangle(int ab, int bc, int cd) {
        if (ab != 0 && bc != 0 && cd != 0) {
            this.ab = ab;
            this.bc = bc;
            this.cd = cd;
        } else System.out.println("Недопустимое значение!");

        if (ab == bc && bc == cd && cd == ab) {
            System.out.println("Вы создали равносторонний треугольник.");
        }
    }

    public double areaСalc() {
        double p = (ab + bc + cd) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - cd));
    }

    public int perimeterCalc() {
        return ab + bc + cd;
    }

    public int findMedian () {
        return 0;
    }
}
