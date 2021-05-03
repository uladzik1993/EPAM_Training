package by.epam.training.module05.task03;

public class View {

    // лучше сделать статическим, там можно просто на имени класса вызывать методы, не создавая нового инстанса
    public static void printWeekendDay(Calendar calendar) {
        System.out.println("Weekend days: ");

        for (Calendar.Month month : calendar.getMonths()) {
            System.out.println(month.getName() + ":");
            for (Calendar.Day day : month.getDays()) {
                if (day.isWeekend()) {
                    System.out.println(day);
                }
            }
        }
        System.out.println();
    }

    public static void printResult(boolean result) {
        System.out.println("Is the day Holiday? - " + result);
    }
}
