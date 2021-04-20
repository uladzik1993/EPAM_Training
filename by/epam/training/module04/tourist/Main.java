package by.epam.training.module04.tourist;

// Туристические путевки.
// Сформировать набор предложений клиенту по выбору
// туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // Туристические путевки. Сформировать набор предложений клиенту по выбору
        // туристической путевки различного вида (отдых, экскурсии, лечение, шопинг,
        // круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
        // транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

        Logic selectLogic = new Logic(); // Объект для вызова на нем логики
        Offer selectOffer = new Offer();
        View print = new View();
        Offer allOffer = new Offer(Type.offerType.MIDDLE);

        // Создаем тестовое общее предложение путевок

        allOffer.add(new Agency(10001, Type.tourType.REST, Type.transportation.BY_PLAIN, Type.food.ALL_INCLUSIVE,
                Type.destination.PARIS, 5, 2300));
        allOffer.add(new Agency(10002, Type.tourType.EXCURSION, Type.transportation.BY_PLAIN, Type.food.ALL_INCLUSIVE,
                Type.destination.MOSCOW, 12, 3897));
        allOffer.add(new Agency(10000, Type.tourType.TREATMENT, Type.transportation.BY_TRAIN, Type.food.ALL_INCLUSIVE,
                Type.destination.KRUPKI, 14, 2000));
        allOffer.add(new Agency(10005, Type.tourType.WALKING, Type.transportation.ON_FOOT, Type.food.ABSENT,
                Type.destination.FEODOSIA, 6, 900));
        allOffer.add(new Agency(10004, Type.tourType.EXCURSION, Type.transportation.BY_PLAIN, Type.food.BREAKFAST_AND_LUNCH,
                Type.destination.PARIS, 7, 3600));

        // Отсортировать предложение можно по цене ByPrice, по количеству ночей ByNumNights, по id ById
        Collections.sort(allOffer.getList(), Agency.ByPrice);

        // Методы выборки перегружены по всем Enum-параметрам
        selectOffer = selectLogic.selectOfferByEnum(allOffer, Type.tourType.REST);
        print.print(selectOffer);

        // Выборка по условиям цены и количества ночей проводится исходя из min и max значения данных параметров
        selectOffer = selectLogic.selectOfferByPrice(allOffer, 1500, 2000);
        print.print(selectOffer);

        selectOffer = selectLogic.selectOfferByNumNight(allOffer, 6, 10);
        print.print(selectOffer);

    }
}
