package by.epam.training.module04.task08;

import java.util.Locale;

public class Logic {
    public static Customer[] sortBySurname(Customer[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                boolean sorted = false;
                if (list[i].getSurname().toLowerCase().charAt(0) >
                        list[j].getSurname().toLowerCase().charAt(0)) {
                    Customer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                } else if (list[i].getSurname().toLowerCase().charAt(0) ==
                        list[j].getSurname().toLowerCase().charAt(0)) {
                    int k = 0;
                    while (k < Math.min(list[i].getSurname().length(),
                            list[j].getSurname().length()) &&
                            list[i].getSurname().toLowerCase().charAt(k) ==
                                    list[j].getSurname().toLowerCase().charAt(k)) {
                        k++;
                    }
                    if (k < Math.min(list[i].getSurname().length(),
                            list[j].getSurname().length()) && sorted == false &&
                            list[i].getSurname().toLowerCase().charAt(k) >
                                    list[j].getSurname().toLowerCase().charAt(k)) {
                        Customer temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                        sorted = true;
                    }
                }
            }
        }
        return list;
    }

    public static String sortByCardNo(Customer[] list) {
        String str = "";
        String delimetr = "\n";
        for (int i = 0; i < list.length; i++) {
            if (list[i].getCardNumber() < 30000000 && list[i].getCardNumber() > 20000000) {
                str = str.concat(delimetr.concat(list[i].getSurname() + " " +
                        list[i].getName() + " " + list[i].getPatronymic() +
                        " " + list[i].getCardNumber()));
            }
        }

        return str;
    }

}
