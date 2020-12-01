package by.epam.training.module03.stringbuilder.task06;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Module03Task06 {
    public static void main(String[] args) {
        String words = "Take a kilogram of fresh bananas";
        System.out.println(doubleСharacters(words));
    }

    private static String doubleСharacters(String str) {
        StringBuilder sb = new StringBuilder();
        char[] words = creatArray(str);
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            sb.append(words[i]);
        }
        str = sb.toString();
        return str;
    }

    private static char[] creatArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}
