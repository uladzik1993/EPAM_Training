package by.epam.training.module05.task03;

public class CalendarBase {

    public static Calendar createCalendar(int year) {
        Calendar calendar = new Calendar();

        Calendar.Month month1 = new Calendar.Month("April");
        Calendar.Month month2 = new Calendar.Month("May");

        month1.addDay(new Calendar.Day(1, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(new Calendar.Day(2, Calendar.DayName.THURSDAY, false));
        month1.addDay(new Calendar.Day(3, Calendar.DayName.FRIDAY, false));
        month1.addDay(new Calendar.Day(4, Calendar.DayName.SATURDAY, true));
        month1.addDay(new Calendar.Day(5, Calendar.DayName.SUNDAY, true));
        month1.addDay(new Calendar.Day(6, Calendar.DayName.MONDAY, false));
        month1.addDay(new Calendar.Day(7, Calendar.DayName.TUESDAY, false));
        month1.addDay(new Calendar.Day(8, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(new Calendar.Day(9, Calendar.DayName.THURSDAY, false));
        month1.addDay(new Calendar.Day(10, Calendar.DayName.FRIDAY, false));
        month1.addDay(new Calendar.Day(11, Calendar.DayName.SATURDAY, true));
        month1.addDay(new Calendar.Day(12, Calendar.DayName.SUNDAY, true));
        month1.addDay(new Calendar.Day(13, Calendar.DayName.MONDAY, false));
        month1.addDay(new Calendar.Day(14, Calendar.DayName.TUESDAY, false));
        month1.addDay(new Calendar.Day(15, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(new Calendar.Day(16, Calendar.DayName.THURSDAY, false));
        month1.addDay(new Calendar.Day(17, Calendar.DayName.FRIDAY, false));
        month1.addDay(new Calendar.Day(18, Calendar.DayName.SATURDAY, true));
        month1.addDay(new Calendar.Day(19, Calendar.DayName.SUNDAY, true));
        month1.addDay(new Calendar.Day(20, Calendar.DayName.MONDAY, false));
        month1.addDay(new Calendar.Day(21, Calendar.DayName.TUESDAY, false));
        month1.addDay(new Calendar.Day(22, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(new Calendar.Day(23, Calendar.DayName.THURSDAY, false));
        month1.addDay(new Calendar.Day(24, Calendar.DayName.FRIDAY, false));
        month1.addDay(new Calendar.Day(25, Calendar.DayName.SATURDAY, true));
        month1.addDay(new Calendar.Day(26, Calendar.DayName.SUNDAY, true));
        month1.addDay(new Calendar.Day(27, Calendar.DayName.MONDAY, true));
        month1.addDay(new Calendar.Day(28, Calendar.DayName.TUESDAY, true));
        month1.addDay(new Calendar.Day(29, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(new Calendar.Day(30, Calendar.DayName.THURSDAY, false));


        month2.addDay(new Calendar.Day(1, Calendar.DayName.FRIDAY, true));
        month2.addDay(new Calendar.Day(2, Calendar.DayName.SATURDAY, true));
        month2.addDay(new Calendar.Day(3, Calendar.DayName.SUNDAY, true));
        month2.addDay(new Calendar.Day(4, Calendar.DayName.MONDAY, false));
        month2.addDay(new Calendar.Day(5, Calendar.DayName.TUESDAY, false));
        month2.addDay(new Calendar.Day(6, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(new Calendar.Day(7, Calendar.DayName.THURSDAY, false));
        month2.addDay(new Calendar.Day(8, Calendar.DayName.FRIDAY, false));
        month2.addDay(new Calendar.Day(9, Calendar.DayName.SATURDAY, true));
        month2.addDay(new Calendar.Day(10, Calendar.DayName.SUNDAY, true));
        month2.addDay(new Calendar.Day(11, Calendar.DayName.MONDAY, false));
        month2.addDay(new Calendar.Day(12, Calendar.DayName.TUESDAY, false));
        month2.addDay(new Calendar.Day(13, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(new Calendar.Day(14, Calendar.DayName.THURSDAY, false));
        month2.addDay(new Calendar.Day(15, Calendar.DayName.FRIDAY, false));
        month2.addDay(new Calendar.Day(16, Calendar.DayName.SATURDAY, true));
        month2.addDay(new Calendar.Day(17, Calendar.DayName.SUNDAY, true));
        month2.addDay(new Calendar.Day(18, Calendar.DayName.MONDAY, false));
        month2.addDay(new Calendar.Day(19, Calendar.DayName.TUESDAY, false));
        month2.addDay(new Calendar.Day(20, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(new Calendar.Day(21, Calendar.DayName.THURSDAY, false));
        month2.addDay(new Calendar.Day(22, Calendar.DayName.FRIDAY, false));
        month2.addDay(new Calendar.Day(23, Calendar.DayName.SATURDAY, true));
        month2.addDay(new Calendar.Day(24, Calendar.DayName.SUNDAY, true));
        month2.addDay(new Calendar.Day(25, Calendar.DayName.MONDAY, false));
        month2.addDay(new Calendar.Day(26, Calendar.DayName.TUESDAY, false));
        month2.addDay(new Calendar.Day(27, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(new Calendar.Day(28, Calendar.DayName.THURSDAY, false));
        month2.addDay(new Calendar.Day(29, Calendar.DayName.FRIDAY, false));
        month2.addDay(new Calendar.Day(30, Calendar.DayName.SATURDAY, true));
        month2.addDay(new Calendar.Day(31, Calendar.DayName.SUNDAY, true));

        calendar.add(month1);
        calendar.add(month2);

        return calendar;
    }

}
