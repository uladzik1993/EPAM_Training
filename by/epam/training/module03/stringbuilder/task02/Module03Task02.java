package by.epam.training.module03.stringbuilder.task02;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Module03Task02 {

    public static void main(String[] args) {
        String text = "Eat some more of these soft French buns and have some tea";

        System.out.println("Ваш текст: " + text);
        System.out.println();
        System.out.println("Ваш текст после исправления: " + insertBAfterA(text));
    }

    private static String insertBAfterA(String str) {
        StringBuilder tmpStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                tmpStr.append(str.charAt(i)).append("b");
            } else tmpStr.append(str.charAt(i));
        }
        return tmpStr.toString();
    }
}
