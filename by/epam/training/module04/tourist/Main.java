package by.epam.training.module04.tourist;

// Туристические путевки.
// Сформировать набор предложений клиенту по выбору
// туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class Main {
    public static void main(String[] args) {

        // Туристические путевки. Сформировать набор предложений клиенту по выбору
        // туристической путевки различного вида (отдых, экскурсии, лечение, шопинг,
        // круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
        // транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

        OfferService selectOfferService = new OfferService(); // Объект для вызова на нем логики
        Agency offers = new Agency(Type.offerType.MIDDLE);

        // Создаем тестовое общее предложение путевок

        offers.add(new Offer(10001, Type.tourType.REST, Type.transportation.BY_PLAIN, Type.food.ALL_INCLUSIVE,
                Type.destination.PARIS, 5, 2300));
        offers.add(new Offer(10002, Type.tourType.EXCURSION, Type.transportation.BY_PLAIN, Type.food.ALL_INCLUSIVE,
                Type.destination.MOSCOW, 12, 3897));
        offers.add(new Offer(10000, Type.tourType.TREATMENT, Type.transportation.BY_TRAIN, Type.food.ALL_INCLUSIVE,
                Type.destination.KRUPKI, 14, 2000));
        offers.add(new Offer(10005, Type.tourType.WALKING, Type.transportation.ON_FOOT, Type.food.ABSENT,
                Type.destination.FEODOSIA, 6, 900));
        offers.add(new Offer(10004, Type.tourType.EXCURSION, Type.transportation.BY_PLAIN, Type.food.BREAKFAST_AND_LUNCH,
                Type.destination.PARIS, 7, 3600));

        // Отсортировать предложение можно по цене ByPrice, по количеству ночей ByNumNights, по id ById
        offers.getOffers().sort(Offer.ByPrice);

        // Методы выборки перегружены по всем Enum-параметрам
        Agency result = selectOfferService.getOffersByEnumParameter(offers, Type.tourType.REST);
        View.printOffers(result);

        // Выборка по условиям цены и количества ночей проводится исходя из min и max значения данных параметров
        result = selectOfferService.getOffersByPrice(offers, 1500, 2000);
        View.printOffers(result);

        result = selectOfferService.getOffersByNumNight(offers, 6, 10);
        View.printOffers(result);
    }
}
