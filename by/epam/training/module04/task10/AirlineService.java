package by.epam.training.module04.task10;

public class AirlineService {

    public AirlineBase getByDestination(AirlineBase list, String destination) {
        AirlineBase selectedList = new AirlineBase();
        for (Airline airline : list.getList()) {
            if (airline.getDestination().equals(destination)) {
                selectedList.add(airline);
            }
        }
        return selectedList;
    }

    public AirlineBase getByWeekDay(AirlineBase list, String weekDay) {
        AirlineBase selectedList = new AirlineBase();

        for (Airline airline : list.getList()) {
            if (airline.getDayOfWeek().equals(weekDay)) {
                selectedList.add(airline);
            }
        }
        return selectedList;
    }

    public AirlineBase getByDepartureTime(AirlineBase flights, String time) {
        AirlineBase selectedList = new AirlineBase();

        for (Airline airline : flights.getList()) {
            if (minAlphabetSequence(airline.getDepartureTime(), time)) {
                selectedList.add(airline);
            }
        }
        return selectedList;
    }

    // Исходя из имени метода и переменных внутри его мне не понятно вообще что он делает
    private boolean minAlphabetSequence(String word1, String word2) {
        String tmpWord1;
        String tmpWord2;
        int minNum;
        int tmpNumWord1;
        int tmpNumWord2;

        tmpWord1 = word1.toLowerCase();
        tmpWord2 = word2.toLowerCase();
        minNum = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minNum; i++) {
            tmpNumWord1 = tmpWord1.charAt(i);
            tmpNumWord2 = tmpWord2.charAt(i);

            if (tmpNumWord1 < tmpNumWord2) {
                return false;
            } else if (tmpNumWord1 > tmpNumWord2) {
                return true;
            }
        }
        return false;
    }
}
