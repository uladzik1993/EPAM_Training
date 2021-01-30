package by.epam.training.module04.task06;

public class Clock {
    private int hour;
    private int min;
    private int sec;

    public Clock() {
        hour = 12;
        min = 30;
        sec = 19;
    }

    public Clock(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Не допустимое значение.");
            this.hour = 0;
        }
    }

    public void setMin(int min) {
        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            System.out.println("Не допустимое значение.");
            this.min = 0;
        }
    }

    public void setSec(int sec) {
        if (sec >= 0 && sec < 60) {
            this.sec = sec;
        } else {
            System.out.println("Не допустимое значение.");
            this.sec = 0;
        }
    }

    public void addHour(int hour) {
        this.hour += hour;
        if (this.hour >= 24) {
            this.hour -= 24;
        }
    }

    public void addMin(int min) {
        this.min += min;
        if (this.min >= 60) {
            addHour(this.min / 60);
            this.min -= 60;
        }
    }

    public void addSec(int sec) {
        this.sec += sec;
        if (this.sec >= 60) {
            int tmpMin = this.sec / 60;
            addMin(tmpMin);
            this.sec -= tmpMin * 60;
        }
    }


    @Override
    public String toString() {
        return "Текущее время: " + hour + " : " + min + " : " + sec;
    }
}
