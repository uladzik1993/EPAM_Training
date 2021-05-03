package by.epam.training.module04.task08;

public class View {
    public static void printSortedBySurname(Customer[] list) {
        System.out.println("ФИО клиентов в алфавитном порядке");

        list = CustomerService.sortBySurname(list);

        for (Customer x : list) {
            System.out.println(x.getSurname() + " " + x.getName() + " " +
                    x.getPatronymic());
        }
    }

    public static void printSortedByCardNumberRange(Customer[] list, int min, int max) {
        System.out.println("ФИО клиентов, номера которых находятся в диапазоне от " + min
                + " до " + max + ":");
        String str = CustomerService.sortByCardNo(list, min, max);
        System.out.println(str);
    }
}
