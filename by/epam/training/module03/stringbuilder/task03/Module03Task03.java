package by.epam.training.module03.stringbuilder.task03;

// Проверить, является ли заданное слово палиндромом.

public class Module03Task03 {
    public static void main(String[] args) {
        String iSay = "топот";
        System.out.println(checkPalindrome(iSay));
    }

    private static String turnOver(String str) {
        StringBuffer sb2 = new StringBuffer(str);
        StringBuffer tmp = sb2.reverse();
        str = sb2.toString();
        return str;
    }

    private static boolean checkPalindrome(String str) {
        boolean result = true;
        String temp = turnOver(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != temp.charAt(i)) {
                result = false;
            }
        }
        return result;
    }
}
