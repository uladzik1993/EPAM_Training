package by.epam.training.module05.task03;

public class CalendarBase {

    public static Calendar createCalendar(int year) {
        Calendar newCalendar = new Calendar();

        Calendar.Month month1 = newCalendar.new Month("April");
        Calendar.Month month2 = newCalendar.new Month("May");

        month1.addDay(newCalendar.new Day(1, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(newCalendar.new Day(2, Calendar.DayName.THURSDAY, false));
        month1.addDay(newCalendar.new Day(3, Calendar.DayName.FRIDAY, false));
        month1.addDay(newCalendar.new Day(4, Calendar.DayName.SATURDAY, true));
        month1.addDay(newCalendar.new Day(5, Calendar.DayName.SUNDAY, true));
        month1.addDay(newCalendar.new Day(6, Calendar.DayName.MONDAY, false));
        month1.addDay(newCalendar.new Day(7, Calendar.DayName.TUESDAY, false));
        month1.addDay(newCalendar.new Day(8, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(newCalendar.new Day(9, Calendar.DayName.THURSDAY, false));
        month1.addDay(newCalendar.new Day(10, Calendar.DayName.FRIDAY, false));
        month1.addDay(newCalendar.new Day(11, Calendar.DayName.SATURDAY, true));
        month1.addDay(newCalendar.new Day(12, Calendar.DayName.SUNDAY, true));
        month1.addDay(newCalendar.new Day(13, Calendar.DayName.MONDAY, false));
        month1.addDay(newCalendar.new Day(14, Calendar.DayName.TUESDAY, false));
        month1.addDay(newCalendar.new Day(15, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(newCalendar.new Day(16, Calendar.DayName.THURSDAY, false));
        month1.addDay(newCalendar.new Day(17, Calendar.DayName.FRIDAY, false));
        month1.addDay(newCalendar.new Day(18, Calendar.DayName.SATURDAY, true));
        month1.addDay(newCalendar.new Day(19, Calendar.DayName.SUNDAY, true));
        month1.addDay(newCalendar.new Day(20, Calendar.DayName.MONDAY, false));
        month1.addDay(newCalendar.new Day(21, Calendar.DayName.TUESDAY, false));
        month1.addDay(newCalendar.new Day(22, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(newCalendar.new Day(23, Calendar.DayName.THURSDAY, false));
        month1.addDay(newCalendar.new Day(24, Calendar.DayName.FRIDAY, false));
        month1.addDay(newCalendar.new Day(25, Calendar.DayName.SATURDAY, true));
        month1.addDay(newCalendar.new Day(26, Calendar.DayName.SUNDAY, true));
        month1.addDay(newCalendar.new Day(27, Calendar.DayName.MONDAY, true));
        month1.addDay(newCalendar.new Day(28, Calendar.DayName.TUESDAY, true));
        month1.addDay(newCalendar.new Day(29, Calendar.DayName.WEDNESDAY, false));
        month1.addDay(newCalendar.new Day(30, Calendar.DayName.THURSDAY, false));


        month2.addDay(newCalendar.new Day(1, Calendar.DayName.FRIDAY, true));
        month2.addDay(newCalendar.new Day(2, Calendar.DayName.SATURDAY, true));
        month2.addDay(newCalendar.new Day(3, Calendar.DayName.SUNDAY, true));
        month2.addDay(newCalendar.new Day(4, Calendar.DayName.MONDAY, false));
        month2.addDay(newCalendar.new Day(5, Calendar.DayName.TUESDAY, false));
        month2.addDay(newCalendar.new Day(6, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(newCalendar.new Day(7, Calendar.DayName.THURSDAY, false));
        month2.addDay(newCalendar.new Day(8, Calendar.DayName.FRIDAY, false));
        month2.addDay(newCalendar.new Day(9, Calendar.DayName.SATURDAY, true));
        month2.addDay(newCalendar.new Day(10, Calendar.DayName.SUNDAY, true));
        month2.addDay(newCalendar.new Day(11, Calendar.DayName.MONDAY, false));
        month2.addDay(newCalendar.new Day(12, Calendar.DayName.TUESDAY, false));
        month2.addDay(newCalendar.new Day(13, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(newCalendar.new Day(14, Calendar.DayName.THURSDAY, false));
        month2.addDay(newCalendar.new Day(15, Calendar.DayName.FRIDAY, false));
        month2.addDay(newCalendar.new Day(16, Calendar.DayName.SATURDAY, true));
        month2.addDay(newCalendar.new Day(17, Calendar.DayName.SUNDAY, true));
        month2.addDay(newCalendar.new Day(18, Calendar.DayName.MONDAY, false));
        month2.addDay(newCalendar.new Day(19, Calendar.DayName.TUESDAY, false));
        month2.addDay(newCalendar.new Day(20, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(newCalendar.new Day(21, Calendar.DayName.THURSDAY, false));
        month2.addDay(newCalendar.new Day(22, Calendar.DayName.FRIDAY, false));
        month2.addDay(newCalendar.new Day(23, Calendar.DayName.SATURDAY, true));
        month2.addDay(newCalendar.new Day(24, Calendar.DayName.SUNDAY, true));
        month2.addDay(newCalendar.new Day(25, Calendar.DayName.MONDAY, false));
        month2.addDay(newCalendar.new Day(26, Calendar.DayName.TUESDAY, false));
        month2.addDay(newCalendar.new Day(27, Calendar.DayName.WEDNESDAY, false));
        month2.addDay(newCalendar.new Day(28, Calendar.DayName.THURSDAY, false));
        month2.addDay(newCalendar.new Day(29, Calendar.DayName.FRIDAY, false));
        month2.addDay(newCalendar.new Day(30, Calendar.DayName.SATURDAY, true));
        month2.addDay(newCalendar.new Day(31, Calendar.DayName.SUNDAY, true));

        newCalendar.add(month1);
        newCalendar.add(month2);

        return newCalendar;
    }

}
