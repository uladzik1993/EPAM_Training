package by.epam.training.module04.task08;

public class View {
    public static void printSortedBySurname (Customer[] list) {
        System.out.println("ФИО клиентов в алфавитном порядке");

        list = Logic.sortBySurname(list);

        for (Customer x : list) {
            System.out.println(x.getSurname() + " " + x.getName() + " " +
                    x.getPatronymic());
        }
    }

    public static void ptintSortedByCardNo (Customer[] list) {
        String str;
        System.out.println("ФИО клиентов, номера которых находятся в диапазоне от " +
                "2000000 до 3000000: ");
        str = Logic.sortByCardNo(list);
        System.out.println(str);
    }
}
