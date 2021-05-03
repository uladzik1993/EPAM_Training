package by.epam.training.module04.task10;

// Создать класс Airline, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Airline,
// с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.

// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

// Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели,
// время вылета для которых больше заданного.

public class Main {
    private static final AirlineService airlineService = new AirlineService();

    public static void main(String[] args) {
        AirlineBase schedule = new AirlineBase();
        AirlineBase selectedFlights;
        String destination = "Moscow";
        String dayOfWeek = "Monday";
        String dayOfWeek2 = "Tuesday";
        String checkTime = "15:00";

        View console = new View();

        schedule.add(new Airline("Minsk", 243523, "B37M", "03:45", "Monday"));
        schedule.add(new Airline("Moscow", 624596, "B38M", "10:05", "Tuesday"));
        schedule.add(new Airline("China", 543365, "B37M", "14:20", "Monday"));
        schedule.add(new Airline("Kiev", 967854, "B38M", "20:10", "Tuesday"));

        console.printAllFlights(schedule);

        selectedFlights = airlineService.getByDestination(schedule, destination);
        console.printFlightsByDestination(selectedFlights, destination);

        selectedFlights = airlineService.getByWeekDay(schedule, dayOfWeek);
        console.printFlightsDayOfWeek(selectedFlights, dayOfWeek);

        selectedFlights = airlineService.getByWeekDay(schedule, dayOfWeek2);
        selectedFlights = airlineService.getByDepartureTime(selectedFlights, checkTime);
        console.printFlightsByDayOfWeekAndDepartureTime(selectedFlights, dayOfWeek2, checkTime);
    }
}
