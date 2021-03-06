package by.epam.training.module04.task03;

public class Student {
    private String surname;
    private String initials;
    private int group;
    private int[] mark = new int[5];

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getInitials() {
        return initials;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setMark(int m1, int m2, int m3, int m4, int m5) {
        mark[0] = m1;
        mark[1] = m2;
        mark[2] = m3;
        mark[3] = m4;
        mark[4] = m5;
    }

    public int[] getMark() {
        return mark;
    }
}
