package by.epam.training.module05.task03;

public class View {
    public void printWeekendDay(Calendar calendar) {
        System.out.println("Weekend days: ");

        for (Calendar.Month month : calendar.getMonthList()) {
            System.out.println(month.getName() + ":");
            for (Calendar.Day day : month.getDayList()) {
                if (day.isWeekend()) {
                    System.out.println(day);
                }
            }
        }
        System.out.println(" ");
    }

    public void printResult (boolean result) {
        System.out.println("Is the day Holiday? - " + result);
    }
}
