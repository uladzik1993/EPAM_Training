package by.epam.training.module05.task03;

// Создать класс Календарь с внутренним классом,
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Main {
    public static void main(String[] args) {
        Calendar calendar;
        View view;
        boolean result;
        Logic logic;
        Calendar weekendCalendar;

        calendar = CalendarBase.createCalendar(2021);

        logic = Logic.getInstance();

        view = new View();

        result = logic.isWeekendDay(calendar.getMonthList().get(1).getDayList().get(3));
        view.printResult(result);

        weekendCalendar = logic.weekendDayList(calendar);
        view.printWeekendDay(weekendCalendar);
    }
}