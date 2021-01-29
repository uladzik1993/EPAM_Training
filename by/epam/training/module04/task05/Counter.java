package by.epam.training.module04.task05;

import java.util.Random;

public class Counter {
    private int count;

    public Counter() {
        count = 50;
    }

    public Counter(int count) {
        this.count = count;
    }

    public void setRandom(int range) {
        Random rand = new Random();
        count = rand.nextInt(range);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void countUp(int max) {
        if (max < count) {
            System.out.println("Error. Число должно быть больше чем " + count);
        } else
            for (int i = count; i <= max; i++) {
                System.out.println(i);
            }

    }

    public void countDown(int min) {
        if (min > count) {
            System.out.println("Error. Число должно быть меньше чем " + count);
        } else
            for (int i = count; i >= min; i--) {
                System.out.println(i);
            }
    }
}
