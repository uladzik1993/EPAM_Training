package by.epam.training.module05.task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calendar {

    private int year;
    //private List<Month> months = new ArrayList<Month>(); Тебе не нужно явно прописывать в <> - Month, джава сама подставит
    private List<Month> months = new ArrayList<>();

    public Calendar() {
    }

    public Calendar(int year) {
        this.year = year;
    }

    public void add(Month month) {
        months.add(month);
    }

    public List<Month> getMonths() {
        return months;
    }

    public void setMonths(List<Month> months) {
        this.months = months;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Calendar [months=" + months + ", year=" + year + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return year == calendar.year && Objects.equals(months, calendar.months);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, months);
    }

    static class Day {
        private int num;
        private DayName dayName;
        private boolean weekend;

        public Day() {

        }

        public Day(int num, DayName dayName, boolean weekend) {
            this.num = num;
            this.dayName = dayName;
            this.weekend = weekend;
        }

        public int getNum() {
            return num;
        }

        public DayName getDayName() {
            return dayName;
        }

        public boolean isWeekend() {
            return weekend;
        }

        public void setWeekend(boolean weekend) {
            this.weekend = weekend;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Day day = (Day) o;
            return num == day.num && weekend == day.weekend && dayName == day.dayName;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num, dayName, weekend);
        }

        @Override
        public String toString() {
            return "Day [num=" + num + ", dayName=" + dayName + ", holiday=" + weekend + "]";
        }
    }

    public enum DayName {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    static class Month {
        private List<Day> days = new ArrayList<>();
        private String name;

        public Month() {

        }

        public Month(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addDay(Day day) {
            this.days.add(day);
        }

        public List<Day> getDays() {
            return days;
        }

        public void setDays(List<Day> days) {
            this.days = days;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Month month = (Month) o;
            return Objects.equals(days, month.days) && Objects.equals(name, month.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(days, name);
        }

        @Override
        public String toString() {
            return "Month [dayList=" + days + ", title=" + name + "]";
        }
    }

}
