package by.epam.training.module03.stringbuilder.task06;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Module03Task06 {
    public static void main(String[] args) {
        String words = "Take a kilogram of fresh bananas";
        System.out.println(doubleCharacters(words));
    }

    private static String doubleCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        char[] letters = createArray(str);
        for (char letter : letters) {
            sb.append(letter);
            if (letter != ' ') { //если пробел не удваиваем
                sb.append(letter);
            }
        }
        str = sb.toString();
        return str;
    }

    private static char[] createArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}
