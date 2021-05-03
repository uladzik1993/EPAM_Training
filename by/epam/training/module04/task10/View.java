package by.epam.training.module04.task10;

public class View {

    void printAllFlights(AirlineBase flights) {
        System.out.println("Task ten. Original list of the flights:");

        for (Airline airline : flights.getList()) {
            System.out.println(airline.toString());
        }
        System.out.println();
    }

    void printFlightsByDestination(AirlineBase flights, String destination) {
        System.out.println("Criterion of the selection - 'destination': " + destination);
        System.out.println("Selected list of the flights:");

        for (Airline airline : flights.getList()) {
            System.out.println(airline.toString());
        }
        System.out.println();
    }

    void printFlightsDayOfWeek(AirlineBase schedule, String weekDay) {
        System.out.println("Criterion of the selection - 'week day': " + weekDay);
        System.out.println("Selected list of the flights:");

        for (Airline airline : schedule.getList()) {
            System.out.println(airline.toString());
        }
        System.out.println();
    }

    void printFlightsByDayOfWeekAndDepartureTime(AirlineBase schedule, String dayOfWeek2, String checkTime) {
        System.out.println("Criterion of the selection - 'week day': " + dayOfWeek2 + "; 'after time': " + checkTime);
        System.out.println("Selected list of the flights:");

        for (Airline airline : schedule.getList()) {
            System.out.println(airline.toString());
        }
        System.out.println();
    }

}
