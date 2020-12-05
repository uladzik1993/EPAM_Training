package by.epam.training.module03.stringbuilder.task04;

// С помощью функции копирования и операции конкантенации составить из частей слова “информатика” слово “торт”.

public class Module03Task04 {
    public static void main(String[] args) {
        String word = "информатика";
        System.out.println(buildNewWord(buildLettersArray(word)));
    }

    private static char[] buildLettersArray(String str) {
        char[] temp = new char[4];

        str.getChars(7, 8, temp, 0);
        str.getChars(3, 5, temp, 1);
        str.getChars(7, 8, temp, 3);

        return temp;
    }

    private static String buildNewWord(char[] arr) {
        StringBuilder newWord = new StringBuilder();
        for (char letter : arr) {
            newWord.append(letter);
        }
        return newWord.toString();
    }
}
