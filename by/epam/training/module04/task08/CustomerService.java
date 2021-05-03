package by.epam.training.module04.task08;

public class CustomerService {

    public static Customer[] sortBySurname(Customer[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
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
                            list[j].getSurname().length()) && list[i].getSurname().toLowerCase().charAt(k) >
                            list[j].getSurname().toLowerCase().charAt(k)) {
                        Customer temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }
        }
        return list;
    }

    public static String sortByCardNo(Customer[] list, int min, int max) {
        String str = "";
        String delimetr = "\n";
        for (Customer customer : list) {
            if (customer.getCardNumber() < max && customer.getCardNumber() > min) {
                str = str.concat(delimetr.concat(customer.getSurname() + " " +
                        customer.getName() + " " + customer.getPatronymic() +
                        " " + customer.getCardNumber()));
            }
        }
        return str;
    }

}
