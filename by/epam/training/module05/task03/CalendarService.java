package by.epam.training.module05.task03;

public class CalendarService {
    private static final CalendarService calendarService = new CalendarService();

    public CalendarService() {
    }

    public static CalendarService getInstance() {
        return calendarService;
    }

    public boolean isWeekendDay(Calendar.Day day) {
        return day.isWeekend();
    }

    public Calendar getWeekendDays(Calendar calendar) {

        Calendar weekendDayCalendar = new Calendar();

        for (Calendar.Month month : calendar.getMonths()) {
            Calendar.Month tmpMonth = new Calendar.Month(month.getName());
            weekendDayCalendar.add(tmpMonth);
            for (Calendar.Day day : month.getDays()) {
                if (day.isWeekend()) {
                    tmpMonth.addDay(day);
                }
            }
        }
        return weekendDayCalendar;
    }

}
