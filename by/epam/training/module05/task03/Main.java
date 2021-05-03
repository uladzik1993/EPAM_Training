package by.epam.training.module05.task03;

// Создать класс Календарь с внутренним классом,
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Main {

    public static void main(String[] args) {
        // Объявляй переменный там же где их инициализируешь а не столпотвори их в начале
//        Calendar calendar;
//        View view;
//        boolean result;
//        Logic logic;
//        Calendar weekendCalendar;

        Calendar calendar = CalendarBase.createCalendar(2021);

        CalendarService calendarService = CalendarService.getInstance();

        boolean result = calendarService.isWeekendDay(calendar.getMonths().get(1).getDays().get(3));
        View.printResult(result);

        Calendar weekendCalendar = calendarService.getWeekendDays(calendar);
        View.printWeekendDay(weekendCalendar);
    }
}