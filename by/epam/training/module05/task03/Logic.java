package by.epam.training.module05.task03;

public class Logic {
    private static Logic logic = new Logic();

    public Logic() {
    }

    public static Logic getInstance() {
        return logic;
    }

    public boolean isWeekendDay(Calendar.Day day) {
        return day.isWeekend();
    }

    public Calendar weekendDayList(Calendar calendar) {

        Calendar weekendDayCalendar = new Calendar();

        for (Calendar.Month month : calendar.getMonthList()) {
            Calendar.Month tmpMonth = weekendDayCalendar.new Month(month.getName());
            weekendDayCalendar.add(tmpMonth);
            for (Calendar.Day day : month.getDayList()) {
                if (day.isWeekend()) {
                    tmpMonth.addDay(day);
                }
            }
        }
        return weekendDayCalendar;
    }

}
