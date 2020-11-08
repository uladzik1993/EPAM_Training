package by.epam.training.module02.sorting.task08;

public class Fraction {
    private long  up;
    private long  down;

    public Fraction(long up, long down) {
        this.up = up;
        this.down = down;
    }

    public long  getUp() {
        return up;
    }

    public void setUp(long  up) {
        this.up = up;
    }

    public long  getDown() {
        return down;
    }

    public void setDown(long  down) {
        this.down = down;
    }

    public Fraction setLeastCommonDenominator(long lcd) {
        up *= ((double) lcd / down);
        down = lcd;
        return this;
    }

    public static int sort(Fraction f1, Fraction f2) {
        return Long.compare(f1.getUp(), f2.getUp());
    }

    @Override
    public String toString() {
        return up + "/" + down;
    }
}
