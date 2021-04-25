package by.epam.training.module05.task03;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private int year;
    private List<Month> monthList;

    {
        monthList = new ArrayList<Month>();
    }

    public Calendar() {
    }

    public Calendar(int year) {
        this.year = year;
    }

    public void add(Month month) {
        monthList.add(month);
    }

    public List<Month> getMonthList() {
        return monthList;
    }

    public void setMonthList(List<Month> monthList) {
        this.monthList = monthList;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Calendar [monthList=" + monthList + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((monthList == null) ? 0 : monthList.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calendar other = (Calendar) obj;
        if (monthList == null) {
            if (other.monthList != null)
                return false;
        } else if (!monthList.equals(other.monthList))
            return false;
        if (year != other.year)
            return false;
        return true;
    }


    class Day {
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
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
            result = prime * result + (weekend ? 1231 : 1237);
            result = prime * result + num;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Day other = (Day) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (dayName != other.dayName)
                return false;
            if (weekend != other.weekend)
                return false;
            if (num != other.num)
                return false;
            return true;
        }

        private Calendar getEnclosingInstance() {
            return Calendar.this;
        }

        @Override
        public String toString() {
            return "Day [num=" + num + ", dayName=" + dayName + ", holiday=" + weekend + "]";
        }
    }

    public enum DayName {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean weekend() {
            switch (this) {
                case SUNDAY:
                case SATURDAY:
                    return true;
                default:
                    return false;
            }

        }
    }

    class Month {
        private List<Day> dayList;
        private String name;

        {
            this.dayList = new ArrayList<Day>();
        }

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
            this.dayList.add(day);
        }

        public List<Day> getDayList() {
            return dayList;
        }

        public void setDayList(List<Day> dayList) {
            this.dayList = dayList;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((dayList == null) ? 0 : dayList.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Month other = (Month) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (dayList == null) {
                if (other.dayList != null)
                    return false;
            } else if (!dayList.equals(other.dayList))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        private Calendar getEnclosingInstance() {
            return Calendar.this;
        }

        @Override
        public String toString() {
            return "Month [dayList=" + dayList + ", title=" + name + "]";
        }
    }

}
