package by.epam.training.module04.task10;

public class Main {
    public static void main(String[] args) {
        AirlineBase schedule = new AirlineBase();
        AirlineBase selectedFlights;
        Logic select = new Logic();
        String destinition = "Moscow";
        String dayOfWeek = "Monday";
        String dayOfWeek2 = "Tuesday";
        String checkTime = "15:00";

        View console = new View();

        schedule.add(new Airline("Minsk", 243523, "B37M", "03:45", "Monday"));
        schedule.add(new Airline("Moscow", 624596, "B38M", "10:05", "Tuesday"));
        schedule.add(new Airline("China", 543365, "B37M", "14:20", "Monday"));
        schedule.add(new Airline("Kiev", 967854, "B38M", "20:10", "Tuesday"));

        console.printFirstStep(schedule);

        selectedFlights = select.destinationSelection(schedule, destinition);
        console.printDestinationSelection(selectedFlights, destinition);

        selectedFlights = select.weekDaySelection(schedule, dayOfWeek);
        console.printDayOfWeekSelection(selectedFlights, dayOfWeek);

        selectedFlights = select.weekDaySelection(schedule, dayOfWeek2);
        selectedFlights = select.departureTimeSelection(selectedFlights, checkTime);
        console.printDayOfWeekAndDepatureTimeSelection(selectedFlights, dayOfWeek2, checkTime);
    }
}
