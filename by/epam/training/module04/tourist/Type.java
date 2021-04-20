package by.epam.training.module04.tourist;

public class Type {

    public enum tourType {

        REST,
        EXCURSION,
        TREATMENT,
        SHOPPING,
        CRUISE,
        WALKING;

        tourType() {
        }
    }

    public enum destination {

        MOSCOW,
        PARIS,
        KIEV,
        FEODOSIA,
        KRUPKI;

        destination() {
        }
    }

    public enum food {

        ALL_INCLUSIVE,
        ONLY_BREAKFAST,
        BREAKFAST_AND_LUNCH,
        ABSENT;

        food() {
        }
    }

    public enum transportation {
        BY_PLAIN,
        BY_TRAIN,
        BY_BUS,
        BY_SHIP,
        ON_FOOT;

        transportation() {
        }
    }

    public enum offerType {

        PREMIUM,
        MIDDLE,
        BASIC;

        offerType() {}
    }

}
