package by.epam.training.module03.task03;

// В строке найти количество цифр.

public class Module03Task03 {

    public static void main(String[] args) {
        String message = "At 5 o'clock I want to borrow 2 books from the 7th library.";
        System.out.println(countNumbers(message));
    }

    private static int countNumbers(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
