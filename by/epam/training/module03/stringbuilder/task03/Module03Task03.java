package by.epam.training.module03.stringbuilder.task03;

// Проверить, является ли заданное слово палиндромом.

public class Module03Task03 {
    public static void main(String[] args) {
        String iSay = "топот";
        // можешь добавить одну проверку на слово-непалиндром
        System.out.println(checkPalindrome(iSay));
    }

    private static String turnOver(String str) {
        StringBuilder sb2 = new StringBuilder(str);  // используй StringBuilder, стрингБаффер вроде ток
        // смысл для многопоточных приложений, можешь сам погуглить StringBuilder vs StringBuffer
        return sb2.reverse().toString();
    }

    private static boolean checkPalindrome(String str) {
        boolean result = true;
        String temp = turnOver(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != temp.charAt(i)) {
                result = false;
                break; // не зачем дальше бегать по циклу если уже чето не совпало
            }
        }
        return result;
    }
}
