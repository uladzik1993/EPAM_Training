package by.epam.training.module03.stringbuilder.task05;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Module03Task05 {
    public static void main(String[] args) {
        String iSay = "Now I will count how many letters I have written 'a' on this line and tell you about it.";

        System.out.println(iSay);
        System.out.println("\nКолличество символов 'a' в данной строке: " + count(iSay));
    }
    private static int count (String str) {
        int count = 0;
        //String a = "a"; // TODO это что такое? ты брал строку целую, а потом первый символ брал, вместо того чтоб сразу сделать типа char
        char a = 'a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }


}
